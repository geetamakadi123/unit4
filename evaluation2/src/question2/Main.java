package question2;


import java.util.Scanner;
public class Main {

	 public static void main(String[] args) {

	        Scanner input=new Scanner(System.in);

	        System.out.println("Enter Number of Students you want to enter:");
	        int number=input.nextInt();
	        Student stud=new Student();

	        for(int i=1;i<=number;i++) {
	        	
	            System.out.println("Enter the Roll Number : ");
	            double RollNumber=input.nextDouble();
	            stud.setRollNumber(RollNumber);
	            System.out.println("Enter the Name :");
	            String name=input.next();
	            stud.setStudentName(name);
	            System.out.println("Enter the marks :");
	            double marks=input.nextDouble();
	            
	            stud.setMarks(marks);
	            System.out.println("Student Details "+("0"+(i)));
	            stud.overloaded();
	        }
	    }
}

