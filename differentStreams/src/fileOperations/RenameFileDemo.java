package com.fastLearner.fileOperations;

import java.io.IOException;
import java.io.File;

public class RenameFileDemo
{
public static void main(String args[]) throws IOException
{
File f1 = new File("../../test/aaa.txt");
File f2  = new File("../../test/bbb.txt");
if(f2.createNewFile())
{
System.out.println("File created Successfully");
}
else System.out.println("File not created");
if(f1.renameTo(f2))
{
System.out.println("Success");
}
else System.out.println("Fail");
}
}
