package question2;


	import java.util.Scanner;
	
	public class Demo {

	    public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String :");
	        String str=sc.nextLine();
	        char[] chr=str.toCharArray();

	        char charTwo=chr[2];
	        System.out.println(str);
	        System.out.println(charTwo);
	    }

}
