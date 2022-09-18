
//Q4) Create a Student bean class having the following properties:
//Instance variables:
//roll,
//name,
//marks,
//grade:char,
//Provide suitable constructors, and following methods:
//public displayDetails(): void
//private calculateGrade(): char


package question4;

public class Student {
	
	    private int roll;
	    private String name;
	    private int marks;
	    private char grade;

	    @Override
	    public String toString()
	    {
	        String details=(this.name+"  "+this.roll+"  "+this.grade+"   "+this.marks);
	        
	        return details;
	    }

	    public void displayDetails(String name,int roll,int marks)
	    {
	        Student student1=new Student();
	        student1.setMarks(marks);
	        student1.setName(name);
	        student1.setRoll(roll);
	        
	        System.out.println(student1.calculateGrade());
	        System.out.println(student1.toString());
	        
	    }
	    
	    private char calculateGrade()
	    {
	        if(this.marks>=500)
	        {
	            setGrade('A');
	        }
	        else if(marks<500 && marks>=400)
	        {
	            setGrade('B');
	        }
	        else if(marks<400)
	        {
	            setGrade('C');
	        }
	        return getGrade();
	        
	    }
	    public void setRoll(int roll) {
	        this.roll=roll;
	    }
	    public int getRoll() {
	        return this.roll;
	    }

	    public void setName(String name) {
	        this.name=name;
	    }
	    public String getName() {
	        return this.name;
	    }
	    public void setMarks(int marks) {
	        this.marks=marks;
	    }
	    public int getMarks() {
	        return this.marks;
	    }
	    public void setGrade(char grade) {
	        this.grade=grade;
	    }
	    public char getGrade() {
	        return this.grade;
	    }


}
