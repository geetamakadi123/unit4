package question3;

public class PermanentEmployee extends Employee{
	
	 private double basicPay;

	    // Getters and Setters

	    public double getBasicPay() {
	        return basicPay;
	    }

	    public void setBasicPay(double basicPay) {
	        this.basicPay = basicPay;
	    }

	    // Write a public 3 argument constructor with arguments – employeeId,
	    // employeeName and basicPay.
	    public PermanentEmployee(int employeeId, String employeeName, double basicpay) {

	        super(employeeId, employeeName);

	        this.basicPay = basicpay;
	    }

	    // Implement the - public void calculateSalary() - method
	    public void calculateSalary() {
	        double PFamount = 0;
	        PFamount = (basicPay * 0.12);
	        setSalary(basicPay - PFamount);
	    }


}
