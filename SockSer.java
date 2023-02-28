package Networking;
import java.io.*;
import java.net.*;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SockSer {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss=new ServerSocket(1244);
			//System.out.println("Sending request to server");
			Socket as=ss.accept();
			System.out.println("Made Connection");
			ObjectInputStream dis=new ObjectInputStream(as.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("The Message is"+str);
			as.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
