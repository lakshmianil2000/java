package Networking;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class ServerFact {

	public static void main(String[] args) {
		try
		{
			int i,fact=1;
			ServerSocket ss=new ServerSocket(1235);
			System.out.println("Waiting for connection from client");
			Socket as=ss.accept();
			System.out.println("Made Connection");
			DataInputStream din=new DataInputStream(as.getInputStream());
			String val = (String)din.readLine();
			//Integer f=Integer.parseInt(val);
			String s1 = val.substring(val.indexOf("t")+1);
			Integer f=Integer.parseInt(s1);
			for(i=1;i<=f;i++)
			{
				fact*=i;
			}
			System.out.println("Factorial of "+f+" = "+fact);
			
			ss.close();
			as.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
