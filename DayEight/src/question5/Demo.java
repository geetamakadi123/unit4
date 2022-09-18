package question5;


import java.util.Scanner;
public class Demo {
	
	 public static void printDetails(Student data){

	        System.out.println("Name : "+data.name);
	        System.out.println("Address : "+data.address);
	        System.out.println("Roll number : "+data.roll);
	        System.out.println("Marks : "+data.marks);

	    }

	    public static void main(String[] args) {

	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter Number of students");
	        int num=input.nextInt();

	       

	         int sum=0;
	        double Average;

	       Object arr;
		for(int i=0;i<num;i++){

	            Student obj=new Student();
	            System.out.println("Enter student Details of "+ (i+1));

	           System.out.println("name");
	            obj.name=input.next();

	           System.out.println("Address");
	            obj.address=input.next();

	           System.out.println("Roll Number");
	            obj.roll=input.nextInt();

	           System.out.println("Marks");
	            obj.marks=input.nextInt();

	            arr.add(obj);

	            sum=sum+ obj.marks;
	        }

	        System.out.println("Enter serial number of student whose details you want to see (starts from 1)");

	        int index=input.nextInt();

	        if(index< (arr.size()-1) && index>0) {
	            Student data = (Student) arr.get(index - 1);

	            printDetails(data);
	        }

	        else{
	            System.out.println("Error");
	        }
	                    Average=(sum/num);
	        System.out.println("-----------------------------------------------------------------");
	        System.out.println("Average marks of all students is "+Average);

	    }

}
