package question2;

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


	            es.add(new Employee(id, name, salary));

	            System.out.println("If you want to add more Employee Detail Enter y/n");
	            String ans=sc.next();
	            if(ans.contains("n")) {
	                break;
	            }

	        }
	        System.out.println(es);
	    }
	
}
