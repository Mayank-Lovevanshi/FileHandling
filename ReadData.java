import java.io.FileInputStream;

public class ReadData
{
public static void main(String args[])
{
FileInputStream fis = null;
try
{
fis = new FileInputStream("data.txt");
int i;
while((i = fis.read())!=-1)
{
System.out.print((char)i);
}
}
catch(Exception e)
{
e.printStackTrace();
}
finally
{
try
{
fis.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
}
