//Write a program to create multiple threads by extending the Thread class.
import java.lang.*; 

class AAA extends Thread{
    String nm;
    AAA(String name){
        nm=name;
    }
    public void run(){//when we call a.start() then this rum method is get executed in thread.
        System.out.println(nm);
        try{
            for(int i =5;i>=0;i--){
                System.out.println("\t"+i);
                Thread.sleep(1000);//just give Thread. to call sleep if thread is no object 
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class BBB extends Thread{
    String nm;
    BBB(String name){
        nm=name;
    }
    public void run(){//when we call a.start() then this rum method is get executed in thread.
        System.out.println(nm);
        try{
            for(int i =10;i>=0;i=i-2){
                System.out.print("\t"+i);
                Thread.sleep(1000);//just give Thread. to call sleep if thread is no object 
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class MainClass9_1{
    public static void main(String args[]){
        AAA a = new AAA("Passed A");
        a.start();
        BBB b = new BBB("Passed B");
        b.start();
    }
}