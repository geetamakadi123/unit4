package question1;

public class Instructor extends Person {
	
	 int instructorId;
	 int salary;
	  public Instructor() {
	      super();
	  }
	    public Instructor(int instructorId, int salary,String name,String city,String state,String pinCode)
	    {
	        super(city,state,pinCode,name);
	        this.instructorId = instructorId;
	        this.salary = salary;

	    }
	    public String toString()
	    {
	        String ans=this.name+" [instructorId="+this.instructorId+", salary="+this.salary+", address=Address [city="+this.city+", state="+this.state+", pincode="+this.pinCode+"]]";
	        return ans;
	    }

}
