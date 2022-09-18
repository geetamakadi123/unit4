package question1;

public class Person extends Address{
	
	 String name;
	 String gender;

	    public Person()
	    {

	    }
	    public Person(String city, String state, String pinCode,String name) {
	        super(city,state,pinCode);
	        this.name=name;
	    }

}
