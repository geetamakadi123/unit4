package question4;

import java.util.Scanner;

public class Java {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		
		String str = sc.next();
		
		System.out.println("Enter a position =>");
		
		int posit = sc.nextInt();
		
		boolean b = true;
		
		while(b) {
			if(posit >= str.length() || posit < 0) {
				System.out.println("Invalid position, Please enter a valid position => ");
				
				posit = sc.nextInt();
				
			}
			else {
				System.out.println("Character at the position 3 => " + str.charAt(posit));
				
				break;
			}
		}
		
		
		
		
		
	}

}
