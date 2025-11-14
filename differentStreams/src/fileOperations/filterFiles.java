package com.fastLearner.fileOperations;

import java.io.IOException;
import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter
{
String n;
MyFilter(String n)
{
this.n = n;
}
public boolean accept(File dir,String name)
{
return name.endsWith(n);
}
}

public class filterFiles
{
public static void main(String args[])
{
File f = new File("../../test/");
MyFilter mf = new MyFilter("txt");
String str[] = f.list(mf);
for(String s:str)
{
System.out.println(s);
}
}
}
