//2.Write a program to implement IS-A Serialization and De-Serialization, for a Maruti Car inherited from Vehicle
//child class - ISA relationship
import java.io.*;

public class Maruti extends Vehicle
{ 
String ctgry;

public Maruti(String name,String type,String ctgry )
{
	super( name,type);
	this.ctgry=ctgry;
}

public void disp()
{
	super.disp();
	System.out.println("ctgry is " + ctgry);
}
}