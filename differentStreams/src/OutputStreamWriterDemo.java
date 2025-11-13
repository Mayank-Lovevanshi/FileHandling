package com.fastLearner.Writer;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo
{
public static void main(String args[]) throws IOException
{
String data = "This is to explain OutputStreamWriter class";
FileOutputStream fos = new FileOutputStream("../test/output.txt");
OutputStreamWriter osw = new OutputStreamWriter(fos);
osw.write(data);
osw.close();
fos.close();
}
}
