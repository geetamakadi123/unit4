package question2;



public class Student {
	 private double rollNumber;
	    private String studentName;
	    private double marks;
	    public void overloaded() {

	    	//System.out.println("Student Details :"+" "());
	        System.out.println("Student Roll No :"+" "+getRollNumber());
	        System.out.println("Student name    :"+" "+getStudentName() );
	        System.out.println("Student Marks   :"+" "+getMarks());

	    }
	    public double getRollNumber() {
	        return rollNumber;
	    }
	    public void setRollNumber(double rollNumber) {
	        this.rollNumber = rollNumber;
	    }
	    public String getStudentName() {
	        return studentName;
	    }
	    public void setStudentName(String studentName) {
	        this.studentName = studentName;
	    }
	    public double getMarks() {
	        return marks;
	    }
	    public void setMarks(double marks)

	    {
	        this.marks = marks;
	    }
	     Student() {

	    }
}
