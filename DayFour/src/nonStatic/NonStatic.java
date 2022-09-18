package nonStatic;

public class NonStatic {
	
 int number;
	
	public void printnumber(){
		
		
		if(this.number%2 != 0) {
			System.out.println(number);
		}
		
		else if(number<0) {
			System.out.println("Error");
		}
		else {
			int m= number-number%10+10;
			
			System.out.println(m);
		}
		}
		
		
	//}

	public static void main(String[] args) {
		
		
		
		NonStatic s1=new NonStatic();
		s1.number= 44;
		s1.printnumber();
		// TODO Auto-generated method stub

	}


} 


