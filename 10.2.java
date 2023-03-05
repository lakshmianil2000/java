//Write a program to display the contents of a given directory(take the directory path through the keyboard)including its subdirectory content using recursive function.
import java.io.*;
class class10_2
{
	static void listall(String p)
	{
		try
		{
			File f=new File(p);
			File[] fa=f.listFiles();
			for(File A:fa)
			{
				if(A.isFile())
				{
					System.out.println("File "+A);
				}
				else
				{
					System.out.println("Directory "+A);
					listall(A.getPath());
				}
			}
		}
		catch(Exception e){System.out.println(e);}
	}
	public static void main(String args[])
	{
		String s;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the path");
			s=din.readLine();
			listall(s);
		}
		catch(IOException e){System.out.println(e);}
	}
}