//Write a program to implement Serialization and De-Serialization, for an object of Student Class.

import java.io.*;
public class StuSer
{
public static void main(String args[])
{
 Student s=new Student("Bitty",21,"F");
 try
 {
 FileOutputStream fos=new FileOutputStream("C:\\Users\\bitty\\Desktop\\JAVA\\slot 12\\Stu.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(s);
 fos.close();
 oos.close();
 System.out.println("Serialization happened");
 }
 catch(IOException e)
 {
 System.out.println(e);
 }
}
}
