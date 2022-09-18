package question4;

import java.util.Scanner;

public class Factorial {
	
	

	    static void arr(int[] ar) {

	        System.out.println("output");
	        if (ar.length == 1) {
	            int num = ar[0];
	            int fact = 1;
	            for (int i = 1; i <= num; i++) {
	                fact = fact * i;
	            }
	            System.out.println(fact);
	        }

	        else if (ar.length == 3) {
	            int num = ar[0] - ar[1];
	            num = Math.abs(num);
	            int fact = 1;
	            for (int i = 1; i <= num; i++) {
	                fact = fact * i;
	            }
	            System.out.println(fact);

	        }

	        else {
	            System.out.println("Error");

	        }

	    }


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Value");

	        String ar = sc.nextLine();

	        int[] arr1 = new int[ar.length()];

	        String str = "";
	        
	        int i = 0;
	        
	        for (Character ch : ar.toCharArray()) {

	            if (Character.isWhitespace(ch)) {
	                arr1[i] = Integer.parseInt(str);
	                i++;
	                str = "";
	            } else {
	                str += ch;
	            }

	        }
	        arr1[i] = Integer.parseInt(str);
	        
	        i++;
	        
	        str = "";

	        arr(arr1);

	    }

}


