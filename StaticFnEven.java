
import java.io.DataInputStream;
import java.io.IOException;

class StaticFnEven{
    static{
        try{
            System.out.println("This is a static function");
            System.out.println("Enter a number:");
            DataInputStream dis= new DataInputStream(System.in);
            int num=Integer.parseInt(dis.readLine());
            System.out.println("The Even numbers are");
            for(int i=0;i<num;i=i+2){
                System.out.println(i);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    public static void main(String args[]){
        System.out.println("This is the main fn");
    }
}