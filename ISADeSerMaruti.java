//2.Write a program to implement IS-A Serialization and De-Serialization, for a Maruti Car inherited from Vehicle
import java.io.*;

public class  ISADeSerMaruti
{
    public static void main (String args[])
    {
        Maruti m = null;
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\bitty\\Desktop\\JAVA\\slot 12\\ismaruti.txt");
            ObjectInputStream ois= new ObjectInputStream(fin);
            m=(Maruti)ois.readObject();// read
            m.disp();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException f)
        {
            System.out.println(f);
        }
    }
}