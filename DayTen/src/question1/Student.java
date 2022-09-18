package question1;

import java.util.ArrayList;

public class Student extends Person{
	
	int studentId;
    String courseEnrolled;
    int courseFee;

    public Student() {

        super();
    }

    public Student(int studentId, String courseEnrolled, int courseFee,String name,String city,String state,String pinCode)
    {
        super(city,state,pinCode,name);
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;

    }
    public String toString()
    {
        String ans=this.name+" [studentId="+this.studentId+", courseFee="+this.courseFee+", courseEnrolled="+this.courseEnrolled+
                ", address=Address [city="+this.city+", state="+this.state+", pincode="+this.pinCode+"]]";
        return ans;
   }

}
