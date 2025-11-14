package com.fastLearner.fileOperations;

import java.io.*;

public class deleteFileDemo
{
public static void main(String args[]) throws IOException
{
File f = new File("../../test/bbb.txt");
if(f.delete())
{
System.out.println("Success");
}
else System.out.println("Fail");
}
}
