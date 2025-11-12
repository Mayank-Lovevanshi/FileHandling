
import java.io.*;

public class BufferedInputStreamDemo
{
public static void main(String args[]) throws IOException
{
FileInputStream fis = new FileInputStream("../test/data.txt");
BufferedInputStream bis = new BufferedInputStream(fis);
int i;
while((i=bis.read())!=-1)
{
System.out.print((char)i);
}
bis.close();
fis.close();
}
}
