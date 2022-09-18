package question4;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	 public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        
	        TreeSet<Employee> es=new TreeSet<>();

	        while(true) {
	            System.out.println("Enter Employee Id");
	            int id=sc.nextInt();
	            System.out.println("Enter Employee Name");
	            String name=sc.next();
	            System.out.println("Enter Employee Salary");
	            double salary=sc.nextDouble();
	            System.out.println("Enter the Department Id:");
	            int DepartmentId=sc.nextInt();
	            System.out.println("Enter the Department Name:");
	            String DepartmentName=sc.next();


	            es.add(new Employee(id, name, salary,DepartmentId,DepartmentName));

	            System.out.println("If you want to add more Employee Detail Enter y/n");
	            String ans=sc.next();
	            if(ans.contains("n")) {
	                System.out.println("Thank you...!!");
	                break;
	            }

	        }
	        System.out.println(es);
	    }

}
