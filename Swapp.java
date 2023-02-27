import java.io.*;
import java.lang.*;
class Swapp
{
public static void main(String args[])
{
String str,str1;
int a,b,temp;

DataInputStream dis=new DataInputStream(System.in);
try
{
System.out.println("enter the number");
str=dis.readLine();
a=Integer.parseInt(str);
System.out.println("enter the number");
str1=dis.readLine();
b=Integer.parseInt(str1);
temp=a;
a=b;
b=temp;
System.out.println("a=" +a);
System.out.println(" b=" +b);
}catch(IOException e)
{
System.out.println(e);
}}
}