import java.lang.*;
class First{
	synchronized public void disp(String msg){
	System.out.println("[" +msg);
	try{
		Thread.sleep(1000);
	}catch(InterruptedException e)
	{   
	System.out.println(e);}
	System.out.println("]");
	}
}
class second extends Thread{
	First ff;
	String ss;
	second(First f,String s){
		ff=f;
		ss=s;
	}
	public void run(){
		synchronized(ff)
		{
		ff.disp(ss);
	}
}
}
class  sync{
public static void main(String args[]){
First fnew= new First();
second s1=new second(fnew,"Rajagiri");
s1.start();
second s2=new second(fnew,"College");
s2.start();
second s3=new second(fnew,"Kalamassery");
s3.start();
}
}
