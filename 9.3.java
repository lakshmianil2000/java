//Write a program to implement Synchronization using inter-thread communication.
class Sum extends Thread{
	int total = 0;
	public void run(){
		for(int i=0;i<=10;i++){
			total = total+i;
		}
	}
}
public class MainClass9_3{
	public static void main(String args[]){
		Sum s = new Sum();
		s.start();
        synchronized(s){// key word 
            try{// wait should be inside try catch
                s.wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
		System.out.println("Sum is "+s.total);
	}
}