import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class DeserializationDemo
{
public static void main(String args[]) throws Exception
{
FileInputStream fis = new FileInputStream("data.txt");
ObjectInputStream ois  = new ObjectInputStream(fis);
Student s = (Student)ois.readObject();
s.show();
}
}
