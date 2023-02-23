import java.io.*;
import java.lang.*;
class Sumseries
{
public static void main(String args[])
{
int n,sum=0,s=0,i,j=1;
try
{
DataInputStream dir=new DataInputStream(System.in);
System.out.println("enter the limit");
n=Integer.parseInt(dir.readLine());
for(i=1;i<=n;i++)
{
 while(j<=i)
 {
 s=s+j;
 j=j+1;
 }
 sum=sum+s;
}
System.out.println("sum is "+sum);
}
catch(Exception e)
{
 System.out.println("error"+e);
}
}
}
