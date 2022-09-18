package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        List<Product>ps=new ArrayList<>();
	        Scanner sc =new Scanner(System.in);

	        while(true) {
	            System.out.println("Enter Product Id");
	            int id=sc.nextInt();
	            System.out.println("Enter Product Name");
	            String name=sc.next();
	            System.out.println("Enter Product Price");
	            double price=sc.nextDouble();


	            ps.add(new Product(id, name, price));

	            System.out.println("If you want to add more Product Detail Enter y/n");
	            String ans=sc.next();
	            if(ans.contains("n")) {
	                break;
	            }

	        }
	        System.out.println("Enter Choose Option 1,2,3");
	        int choose=sc.nextInt();
	        if(choose==1) {
	            Collections.sort(ps,new ProductSortByPrice());
	            System.out.println(ps);
	        }else if(choose==2) {
	            Collections.sort(ps,new ProductSortByName());
	            System.out.println(ps);
	        }else {
	            Collections.sort(ps,new ProductSortById());
	            System.out.println(ps);
	        }

	    }
	
}
