import java.io.*;
import java.lang.*;

class ThrowFinally
{
	public static void checknum(int n)
	{
		if(n==100)
		{
			throw new ArithmeticException("You Are not allowed to enter 100");
		}
		else
		{
			System.out.println("Fine");
		}
	}
	public static void main(String args[])
	{
		int val;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter a Number: ");
			val=Integer.parseInt(din.readLine());
			checknum(val);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		finally
		{
			System.out.println("You were not allowed to enter 100 since there occurs an Exception");
		}
	}
}