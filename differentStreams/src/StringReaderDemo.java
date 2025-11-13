package com.fastLearner.Reader;
import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo
{
public static void main(String args[]) throws IOException
{
StringReader sr = new StringReader("This is string Reader Demo");
int i;
while((i=sr.read())!=-1)
{
System.out.print((char)i);
}
sr.close();
}
}
