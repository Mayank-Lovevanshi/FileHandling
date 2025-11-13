package com.fastLearner.Reader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class InputStreamReaderDemo
{
public static void main(String args[]) throws IOException
{
FileInputStream fis = new FileInputStream("../test/data.txt");
InputStreamReader isr= new InputStreamReader(fis);
int i;
while((i=isr.read())!=-1)
{
System.out.print((char)i);
}
isr.close();
fis.close();
}
}
