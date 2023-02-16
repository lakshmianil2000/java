
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

public class EmployeeDetails {
    public static void main(String args[]){
        try{
            Employee e=new Employee();
            System.out.println("Enter the no: of employee details want to enter:");
            DataInputStream dis =new DataInputStream(System.in);
            int n=Integer.parseInt(dis.readLine());
            e.detailsEmployee(n);
            int choice=0;
            while(choice!=3){
                System.out.println("1. Display the Employee Details 2.Search For an Employee using Employee no: 3.Exit");
                System.out.println("Enter your choice");
                choice=Integer.parseInt(dis.readLine());
                switch(choice){
                    case 1:{
                        e.display(n);
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the employee no to search: ");
                        int val=Integer.parseInt(dis.readLine());
                        e.find(val);
                        break;
                    }
                    case 3:{
                        break;
                    }
                    default:{
                        System.out.println("Wrong choice");
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}
class Employee{
    int eno[];
    String ename[];
    int esal[];
    void detailsEmployee(int n){
        try{
            eno=new int[n];
            ename=new String[n];
            esal=new int[n];
            DataInputStream dis =new DataInputStream(System.in);
            for(int i=0;i<n;i++){
                System.out.println("Enter the Details of the Employee");
                System.out.println("Employee no:");
                eno[i]=Integer.parseInt(dis.readLine());
                System.out.println("Employee name:");
                ename[i]=dis.readLine();
                System.out.println("Employee Salary:");
                esal[i]=Integer.parseInt(dis.readLine());
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void display(int n){
        System.out.println("The Details of the employees:");
        System.out.println("=============================");
        for(int i=0;i<n;i++){
            System.out.println("Employee no: "+eno[i]);
            System.out.println("Name "+ename[i]);
            System.out.println("Salary "+esal[i]);
            System.out.println("=============================");
            System.out.println("\n");
        }
    }
    void find(int val){
        int flag=0;
        for (int x : eno) {
            if(x==val){
                System.out.println("Employee found!!!");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Employee not found!!!");
        }
    }
}