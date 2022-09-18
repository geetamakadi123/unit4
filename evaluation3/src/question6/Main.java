package question6;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int physics = input.nextInt();
		int cheme = input.nextInt();
		int math = input.nextInt();
		int bio  = input.nextInt();
		
		 ScienceStudent s1=new  ScienceStudent(physics,cheme,math,bio);
	       double percent1=s1.getPercentage();

	        System.out.println("percentage of science student is : "+percent1);


	        
	        int history= input.nextInt();
	        int english= input.nextInt();
	        int hindi= input.nextInt();

	         ArtStudent h1=new  ArtStudent(hindi,english, history);
	        double percent2=h1.getPercentage();

	        System.out.println("percentage of history student is : "+percent2);
	        
	        
	        int account= input.nextInt();
	        int economics= input.nextInt();
	        int business= input.nextInt();

	        CommerceStudent m1=new  CommerceStudent(account,economics,business);
	        double percent3=m1.getPercentage();

	        System.out.println("percentage of biology  student is : "+percent3);
	    }
}


