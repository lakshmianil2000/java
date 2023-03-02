import java.lang.*;
import java.io.*;

class First extends Thread
{
	String nm;
	First(String name)
	{
		nm=name;
	}
	public void run()    //Thread class should have the method run()
	{
		System.out.println("Running "+nm);
		try
		{
			for(int i=5;i>=0;i--)
			{
				System.out.println(nm+ " "+i);
				Thread.sleep(1000);   //Thread - current Thread
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}	
}
class Second extends Thread
{
	String nm;
	Second(String name)
	{
		nm=name;
	}
	public void run()    //Thread class should have the method run()
	{
		System.out.println("Running "+nm);
		try
		{
			for(int i=5;i>=0;i--)
			{
				System.out.println(nm+" "+i);
				Thread.sleep(1000);   //Thread - current Thread
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}	
}
class MultiThread
{
	public static void main(String args[])
	{
		String str1;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter name1: ");
			str1=din.readLine();
			First f1=new First(str1);
			f1.start();
			Second s1=new Second("BB");
			s1.start();    
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}