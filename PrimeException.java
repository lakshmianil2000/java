import java.io.*;
import java.lang.*;

class Prime
{
	int c=0,i;
	public int check(int x)
	{
		for(i=2;i<x;i++)
		{
			if(x==2)
				return 1;
			if(x%i==0)
			{
				c++;
			}
		}
		int r=(c==0)?1:0;
		return r;
	}
}

class PrimeException
{
	public static void main(String args[]) 
	{
		Prime p=new Prime();
		int n;
		int s;
		try
		{
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter a Number");
			n=Integer.parseInt(din.readLine());
			if((s=p.check(n))==1)
			{
				throw new PrimeExc("Prime Number!!!!!!!");
			}
		}
		catch(PrimeExc e)
		{
			System.out.println(e);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
class PrimeExc extends Exception
{
	PrimeExc(String mess)
	{
		super(mess);
	}
}