//method - implements Runnable
import java.lang.*;

class AAA implements Runnable
{
		String nm;
	AAA(String name)
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
				System.out.println(i);
				Thread.sleep(1000);   //Thread - current Thread
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}	
}

class RunnableThread
{
	public static void main(String args[])
	{
		AAA a=new AAA("Thread a");
		//creating a thread by passing an object
		Thread t=new Thread(a);
		System.out.println(t.isAlive());
		t.start();     
		System.out.println(t.isAlive());
	}
}