//Q1) Write the logic to reverse the String given in the parameter without the help of predefined
//reverse method and return the reversed String:(HINT use Array)
//class Main{
//public static String reversString(String input){
////write the logic
//}
//public static void main(String[] args){
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter a String to reverse");
//String orignalString = sc.next();
//String result = reversString(originalString);
//System.out.println("Original String is :"+ originalString);
//System.out.println("Reversed String is :"+ result);
//}
//}


package question1;

import java.util.Scanner;

public class Main {
	
	public static String reversString(String orignalString){
	//write the logic
		 String bag="";
	        char[] ch= orignalString.toCharArray();

	        for(int i=ch.length-1;i>=0;i--){

	            bag=bag+ch[i];

	        }

	        return bag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse");
		
		String orignalString = sc.next();
		
		String result = reversString(orignalString);
		
		System.out.println("Original String is :"+ orignalString);
		
		System.out.println("Reversed String is :"+ result);
		}

}


