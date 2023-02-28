import java.util.*;
class ExceptionCheck{
    public void checkPrime(int num){
        int rem=-1;
        int count=0;
        for(int i=1;i<=num/2;i++){
            rem=num%i;
            if(rem==0){
                count++;
            }
        }
        if(count<=2){
            throw new ArithmeticException("Number is Prime");
        }
        else{
            System.out.println("Number is fine!");
        }
    }
}
class UserDefinedException{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number to be validated!");
        n=sc.nextInt();
        ExceptionCheck e = new ExceptionCheck();
        try{
            e.checkPrime(n);
        }catch(ArithmeticException c){
                c.printStackTrace();
        }

    }
}