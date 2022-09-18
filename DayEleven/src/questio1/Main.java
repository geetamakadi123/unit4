package questio1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Car c=new Car();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number Of Passenger: ");
		int numberofpass=sc.nextInt();
		c.setNumberOfPassenger(numberofpass);
		
		System.out.println("Enter number Of Kms: ");
		int noofkms=sc.nextInt();
		c.setNumberOfKms(noofkms);
		Ola MyOla = new Ola();
		Car MyCar = MyOla.bookCar(numberofpass, noofkms);
		int Result = MyOla.calculateBill(MyCar);
		System.out.println("The total fare Amount is: "+ Result);

	
	}
}
