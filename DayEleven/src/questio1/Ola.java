package questio1;

public class Ola {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <=3) {
			HatchBack h1=new HatchBack();
			h1.setNumberOfKms(numberOfKMs);
		
			return h1;
			
		}
		else {
			Sedan s1=new Sedan();
			s1.setNumberOfKms(numberOfKMs);
			return s1;
		}
		
	}
	
	public int calculateBill(Car car) {
		int c=car.getNumberOfKms();
		
		HatchBack h1= new HatchBack();
		int p=h1.farePerKm;
		
		int total=c*p;
		return total;
	}


}
