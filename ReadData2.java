import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadData2
{
public static void main(String args[]) throws FileNotFoundException,IOException
{
FileInputStream fis = new FileInputStream("data.txt");
System.out.println((char)fis.read());
}
}
