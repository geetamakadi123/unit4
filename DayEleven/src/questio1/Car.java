package questio1;

public class Car {
	
	private int numberOfPassenger ;
	private int numberOfKms;
	
//	public int getNumberOfPassenger() {
//		return numberOfPassenger;
//	}
//	public void setNumberOfPassenger(int numberOfPassenger) {
//		this.numberOfPassenger = numberOfPassenger;
//	}
//	public int getNumberOfKms() {
//		return numberOfKms;
//	}
//	public void setNumberOfKms(int numberOfKms) {
//		this.numberOfKms = numberOfKms;
//	}
	
	
	public Car() {
		
	}

	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}


}
