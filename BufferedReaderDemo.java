import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedReaderDemo
{
public static void main(String args[]) throws IOException
{
FileReader fr = new FileReader("input.txt");
BufferedReader br = new BufferedReader(fr);
String email = br.readLine();
String password = br.readLine();
if(email.equals("mayank@gmail.com") && password.equals("mayank@1234"))
{
System.out.println("Logged in");
}
else System.out.println("Failed to Login");
fr.close();
br.close();
}
}
