import java.io.FileReader;

public class ReaderDemo
{
public static void main(String args[])
{
FileReader fr = null;
try
{
fr = new FileReader("HomeWork.java");
int i;
while((i=fr.read())!=-1)
{
System.out.print((char)i);
}
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
try
{
fr.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
}
