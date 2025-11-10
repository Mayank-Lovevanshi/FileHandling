import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteData
{
public static void main(String args[])
{
FileOutputStream fis = null;
try
{
fis = new FileOutputStream("data.txt");
String text = "This is overriden";
byte b[] = text.getBytes();
fis.write(b);
}
catch(IOException e)
{
e.printStackTrace();
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
