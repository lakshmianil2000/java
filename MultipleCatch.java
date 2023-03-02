import java.io.*;
import java.lang.*;

class MultipleCatch
{
	public static void main(String args[])
	{
		int a[];
		int n,i,s;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the size: ");
			n=Integer.parseInt(din.readLine());
			a=new int[n];
			System.out.println("Enter Array elements: ");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(din.readLine());
			}
			System.out.println("Array elements are : ");
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			a[6]=8;
			for(i=0;i<n;i++)
			{
				s=a[i]/0;
				System.out.println(s);
			}	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}
