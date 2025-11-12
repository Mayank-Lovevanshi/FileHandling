package com.fastLearner.BufferedStreams;

import java.io.*;

public class BufferedOutputStreamDemo
{
public static void main(String args[]) throws IOException
{
FileInputStream fis = new FileInputStream("../test/inputFile.txt");
FileOutputStream fos = new FileOutputStream("../test/outputFile.txt");
BufferedInputStream bis = new BufferedInputStream(fis);
BufferedOutputStream bos = new BufferedOutputStream(fos);
StringBuilder sb = new StringBuilder("");
int i;
while((i=bis.read())!=-1)
{
sb.append((char)i);
}
String data = sb.toString();
bos.write(data.getBytes());
bos.close();
bis.close();
fos.close();
fis.close();
}
}
