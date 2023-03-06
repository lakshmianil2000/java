import java.io.*;

public class HasASerEngine
{
    public static void main (String args[])
    {
        HasEngine en = new HasEngine("Automatic");
        try
        {
            FileOutputStream fout = new FileOutputStream("D:\\java\\programs\\hasas.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fout);
            oos.writeObject(en);//write
            System.out.println("HAS A Serialization happened");
        }
        catch(IOException e){System.out.println(e);}
    }
}