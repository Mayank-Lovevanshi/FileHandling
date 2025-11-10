import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData2
{
public static void main(String args[])
{
FileOutputStream fis = null;
try
{
fis = new FileOutputStream("data.txt",false);
String newData = "Hello using append mode for the first time in JAVA\n";
byte b[] = newData.getBytes();
fis.write(b);
}
catch(IOException e)
{
System.out.println(e);
}
finally
{
try
{
fis.close();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}
} 
