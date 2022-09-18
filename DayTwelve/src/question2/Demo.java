package question2;

import java.util.Scanner;

public class Demo {
	
	 public Hotel provideFood(int amount){

	        if(amount>1000){
	            Hotel h1=new TajHotel();

	            return h1;
	        }

	        else if(amount>200 && amount<=1000){
	            Hotel h2=new RoadSideHotel();

	            return h2;
	        }

	        return null;
	    }

	    public static void main(String[] args) {

	        Scanner input=new Scanner(System.in);

	        int Amount=input.nextInt();

	        Demo bag=new Demo();
	        Hotel res=bag.provideFood(Amount);

	        if(res==null){
	            System.out.println("Please Enter a valid amount");
	        }

	        else{
	            if(res instanceof TajHotel){
	               TajHotel T1= (TajHotel) res;
	                T1.welcomeDrink();
	                T1.chickenBiryani();
	                T1.masalaDosa();
	            }
	            else if (res instanceof RoadSideHotel) {
	                RoadSideHotel R1=(RoadSideHotel) res;
	                R1.chickenBiryani();
	                R1.masalaDosa();
	            }

	        }
	    }
	
}


