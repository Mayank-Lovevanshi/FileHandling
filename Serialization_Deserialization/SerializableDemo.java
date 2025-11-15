import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class SerializableDemo
{
public static void main(String args[]) throws IOException
{
Student obj = new Student("Mayank",152,"Acropolis Institute of Technology and Research");
FileOutputStream fos = new FileOutputStream("data.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(obj);
}
}
