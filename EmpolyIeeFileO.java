import java.io.*;
import java.util.*;
public class EmpolyIeeFileO{
    public static void main(String[] args){
        try{

            Scanner obj = new Scanner(System.in);
            FileOutputStream fout=new FileOutputStream("employee2.txt");
            int empno;
            String empname;
            int salary;
            System.out.println("Enter the employee number: ");
            empno=obj.nextInt();
            obj.nextLine();
            int limit=5;
            for(int j=0;j<limit;j++){
                try{
                    System.out.println("Enter the employee number: ");
                    empno=obj.nextInt();
                    obj.nextLine();
                    String a=String.valueOf(empno);
            byte a1[]=a.getBytes();
            fout.write(a1);
            fout.flush();
            fout.write("\r\n".getBytes());
            System.out.println("Enter the employee name: ");
            empname=obj.nextLine();
            byte b[]= empname.getBytes();
            fout.write(b);
            fout.write("\r\n".getBytes());
            System.out.println("Enter the employee salary: ");
            salary = obj.nextInt();
            obj.nextLine();
            String c=String.valueOf(salary);
            byte c1[]=c.getBytes();
            fout.write(c1);
            fout.flush();
            fout.write("\r\n".getBytes());    
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a vaild integer.");
            obj.nextLine();
            j--;
        }
        }
        fout.close();
    }catch(Exception e){
        System.out.println(e);
    }
    try {
        FileInputStream fin = new FileInputStream("employee2.txt"); // Correct class
        System.out.println("Contents of the file:");
        int data;
        while ((data = fin.read()) != -1) {
            System.out.print((char) data);
        }
        fin.close();
    } catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
    
    }
}