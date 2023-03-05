//Write a program to display the contents of a directory by displaying the subdirectory’s name first, then the file names.
import java.io.*;
class class10_1
{
	static void listall(String p)
	{
		try
		{
			File f=new File(p);
			File[] fa=f.listFiles();
			for(File A:fa)
			{
				if(A.isDirectory())
				{
					System.out.println("Directory "+A);
					listall(A.getPath());


				}	
			}
			for(File A:fa)
			{
				if(A.isFile())
				{
					System.out.println("File "+A);
				}
			}				
		}
		catch(Exception e){System.out.println(e);}
	}
	public static void main(String args[])
	{
		listall("aaa");
	}
}