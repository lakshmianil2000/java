//2.Write a program to implement IS-A Serialization and De-Serialization, for a Maruti Car inherited from Vehicle
import java.io.*;

public class Vehicle implements Serializable
{ //selective serializ
String name;
String type;

public Vehicle(String name,String type)
{
	this.name=name;
	this.type=type;
}

public void disp()
{
	System.out.println("Car " + name);
	System.out.println("Type " + type);
}
}

//code Reusability