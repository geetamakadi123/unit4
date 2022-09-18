package question2;

public class Demo {
	
	//Create a Java class Demo with 4 parameterized constructors as follows:
	//1. Demo()
	//2. Demo(String s)
	//3. Demo(int i)
	//4. Demo(float f)
	//Put a statement in all the constructors which will denote it is the part of the respected
	//constructor.
	//Create a Single java object of the Demo class in such a way that it will call all the 4
	//Constructors.

	
		
		   Demo(){
		        this("geeta");
		        System.out.println("inside zero argument constructor Demo()");

		    }

		    Demo(String S){
		        this(7);
		        System.out.println("inside one(String) argument constructor Demo(String s)");
		    }

		    Demo(int i){
		        this(3.141f);
		        System.out.println("inside one argument constructor Demo(int i)");
		    }

		    Demo(float f){
		        System.out.println("inside one(float) argument constructor Demo(float f)");
		    }

		   

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Demo obj=new Demo();

		}

}


	
