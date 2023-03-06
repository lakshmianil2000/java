//3.Write a program to implement HAS-A Serialization and De-Serialization for the Engine of a Vehicle.
//child class - HAS A relationship
import java.io.*;

public class HasEngine implements Serializable
{ 
String ctgry;
Vehicle v = new Vehicle("Brezza","Petrol");

public HasEngine( String ctgry)
{
		this.ctgry=ctgry;
}

public void disp()
{
		System.out.println("Category is " + ctgry);
		v.disp();
}
}