import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork
{
public static void main(String args[])
{
FileInputStream fis = null;
FileOutputStream fos = null;
String inputFile = "inputFile.txt";
String outputFile = "outputFile.txt";

try
{
fis = new FileInputStream(inputFile);
String data = "";
int i;
while((i=fis.read())!=-1)
{
data+=(char)i;
}
byte b[] = data.getBytes();
fos = new FileOutputStream(outputFile,false);
fos.write(b);
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
fos.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
} 
