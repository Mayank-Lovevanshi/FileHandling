package com.fastLearner.fileOperations;

import java.io.File;
import java.io.IOException;

public class createFolders
{
public static void main(String args[]) throws IOException
{
File f1 = new File("../../test/folder1/folder2");
if(f1.mkdirs())
{
System.out.println("Created multiple directories successfully");
}
else 
{
System.out.println("fail");
}
}
}
