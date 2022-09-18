package question4;

public class Employee implements Comparable<Employee>{
	
	private int	empId;
    private String empName;
    private double salary ;

    private int  DepartmentId;

    private String  DepartmentName;



    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ",DepartmentId="+ DepartmentId + ",DepartmentName="+ DepartmentName+"]";
    }
    public Employee() {
        super();
    }
    public Employee(int empId, String empName, double salary, int DepartmentId, String DepartmentName) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.DepartmentId = DepartmentId;
        this.DepartmentName = DepartmentName;
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

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    @Override
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
