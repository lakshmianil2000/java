//3.Write a program to implement HAS-A Serialization and De-Serialization for the Engine of a Vehicle.
import java.io.*;

public class HasADeSerEngine
{
    public static void main (String args[])
    {
        HasEngine v = null;
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\bitty\\Desktop\\JAVA\\slot 12\\hasas.txt");
            ObjectInputStream ois= new ObjectInputStream(fin);
            v=(HasEngine)ois.readObject();// read

            v.disp();
        }
        catch(IOException e){System.out.println(e);}
        catch(ClassNotFoundException f){System.out.println(f);}
    }
}