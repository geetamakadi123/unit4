package question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	 public static void main(String[] args) {
		 List<String> bag=new ArrayList<>();

	        bag.add("Bansi");
	        bag.add("Aatish");
	        

	        System.out.println("Using Iterator Method");

	        Iterator<String> loop=bag.iterator();

	        while(loop.hasNext()){

	            System.out.println(loop.next());
	        }


	        System.out.println("============================");


	        System.out.println("Using for loop");

	        for(int i=0;i< bag.size();i++){

	            System.out.println(bag.get(i));
	        }
           
	        System.out.println("===========================");


	        System.out.println("Using Enhanced for Loop");

	        for(String j:bag){

	            System.out.println("My  Brother  " + j);
	        }


	    }
}
