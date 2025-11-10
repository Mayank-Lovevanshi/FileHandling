import java.io.FileReader;
import java.io.FileWriter;
public class ReaderWriterDemo
{
public static void main(String args[])
{
FileReader fr = null;
FileWriter fw = null;
try
{
fr = new FileReader("ReaderDemo.java");
fw = new FileWriter("WriterTesting.txt");
int i;
StringBuffer sb = new StringBuffer();
while((i=fr.read())!=-1)
{
sb.append((char)i);
}
String data = sb.toString();
fw.write(data);
}
catch(Exception e)
{
e.printStackTrace();
}
finally
{
try
{
fr.close();
fw.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
}
