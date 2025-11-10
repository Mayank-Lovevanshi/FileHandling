import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedWriterDemo
{
public static void main(String args[]) throws IOException
{
try
(
FileReader fr = new FileReader("input.txt");
FileWriter fw = new FileWriter("output.txt");
BufferedReader br = new BufferedReader(fr);
BufferedWriter bw = new BufferedWriter(fw);
)
{
String email = br.readLine();
String password = br.readLine();
if(email.equals(email) && password.equals(password))
{
bw.write("Logged in");
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
