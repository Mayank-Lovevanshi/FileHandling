package com.fastLearner.fileOperations;

import java.io.IOException;
import java.io.File;

public class createNewFileDemo
{
public static void main(String args[]) throws IOException
{
File f = new File("../../test/aaa.txt");
if(f.createNewFile())
{
System.out.println("New file created successfully");
}
else
{
System.out.println("File not created");
}
}
}
