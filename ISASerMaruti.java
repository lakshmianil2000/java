import java.io.*;

public class ISASerMaruti
{
    public static void main (String args[])
    {
        Maruti m = new Maruti("Brezza","Automatic","Petrol");
        try
        {
            FileOutputStream fout = new FileOutputStream("D:\\java\\programs\\ismaruti.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fout);
            oos.writeObject(m);//write
            System.out.println("ISA Serialization happened");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}