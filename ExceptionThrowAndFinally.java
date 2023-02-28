import java.util.*;

class ExceptionThrowAndFinally{
    public static void checkNum(int num){
        if(num==100){
            throw new ArithmeticException("You cannot enter 100!");
        }else{
            System.out.println("Number is fine");
        }
    }
    public static void main(String args[]){
        int ch=-1;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the Number:");
            ch=sc.nextInt();
            checkNum(ch);

        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println(ch+1);
        }

    }
}