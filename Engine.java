//child class - ISA relationship
import java.io.*;

public class Engine extends Vehicle
{ 
String ctgry;

public Engine(String name,String type,String ctgry )
{
	super( name,type);
	this.ctgry=ctgry;
}

public void disp()
{
	super.disp();
	System.out.println("Category " + ctgry);
}
}