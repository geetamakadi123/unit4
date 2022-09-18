package questionThree;

public class Shapes {
	
	 public void  Circle(int radius){
         float pi=22/7;
         double ans=pi*radius*radius;
         System.out.println("Area circle ="+ans);
     }


     public void  Rectangle(int length,int breadth){


         long ans=length*breadth;
         System.out.println("Area rectangle ="+ans);
     }

     public void  Square(int sides){


         int ans=sides*sides;
         System.out.println("Area Square ="+ans);

     }

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s1 = new Shapes();

        s1.Circle(15);

        s1.Rectangle(6,8);
        s1.Square(10);

    }

}


