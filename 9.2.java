//Write a program to implement threads by implementing the Runnable interface.

class AAA implements Runnable{
    String nm;
    AAA(String name){
        nm=name;
    }
    public void run(){
        System.out.println(nm);
        try{
            for(int i =5;i>=0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class MainClass9_2{
    public static void main(String args[]){
        AAA a = new AAA("Gilbert");//this is now automatically thread
        Thread t = new Thread(a);//hear the a is pass to thread

        t.start();//start is an inbuilt method
    } 
}