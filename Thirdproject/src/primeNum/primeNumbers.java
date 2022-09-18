package primeNum;

public class primeNumbers {

	static void primeFactor(int n) {

		if (n < 2 || n > 100) {
			System.out.print("Invalid Number");

		} else {

			for (int i =1; i <=100; i++) {

				if (n % i == 0)
					System.out.print(i + " ");

			}
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number is to be divisible by: ");
		primeFactor(12);

	}

}
