import java.io.*;
class test
{
	public void sum(int a)
	{
		int s=0;
		int rem;
		while(a>0)
		{
			rem=a%10;
			s=s+rem;
			a=a/10;
		}
		System.out.println("sum of digits : "+s);
	}
}
class SumDigit
{
	public static void main(String args[])
	{
		int x;
		try
		{
			System.out.println("Enter x");
			DataInputStream dis=new DataInputStream(System.in);
			x=Integer.parseInt(dis.readLine());
			test t=new test();
			t.sum(x);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}