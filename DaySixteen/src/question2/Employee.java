package question2;

public class Employee {
	
	
	private int	empId;
    private String empName;
    private double salary ;


    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }
    public Employee() {
        super();
    }
    public Employee(int empId, String empName, double salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int compareTo(Employee o) {
        if(this.getSalary()>o.getSalary()) {
            return 1;

        }else 	if(this.getSalary()<o.getSalary()) {
            return -1;

        }else {
            return 0;
        }
    }
}
