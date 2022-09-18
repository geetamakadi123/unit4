package question1;

public class Employee {
	
	private int Id;
	private String  Name;
	private int Salary;
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary1() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	Employee(){	}
	Employee(int id,String name,int salary){
		this.Id=id;
		this.Name=name;
		this.Salary=salary;
	}
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
