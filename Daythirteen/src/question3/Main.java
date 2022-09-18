package question3;

public class Main {
	
	public static void main(String[] args) {

        Employee employee1 = new PermanentEmployee(1,"Name1",1000);
        employee1.calculateSalary();

        Employee employee2 = new TemporaryEmployee(2,"Name2",20,100);
        employee2.calculateSalary();

        Loan loan = new Loan();
        System.out.println("Loan Amount for Permanent Employee => "+ loan.calculateLoanAmount(employee1));
        System.out.println("Loan Amount for Temporary Employee => "+loan.calculateLoanAmount(employee2));
    }


}
