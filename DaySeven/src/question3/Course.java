package question3;

import java.util.Scanner;

public class Course {
	int courseId;
    String courseName;
    int courseFee;


    void DisplayCourseDetails(int courseId, String courseName, int courseFee){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseFee=courseFee;

        System.out.println("Your Course Id  :  "+ courseId);
        System.out.println("Yor Course Name :  "+ courseName);
        System.out.println("Your Course Fee :  "+ courseFee);
    }

    static void authenticate(String username, String password){
        if(username=="Admin" && password=="1234"){
            Course cour=new Course();

            Scanner input=new Scanner(System.in);

            System.out.println("Enter id");
            int courseId=input.nextInt();

            System.out.println("Enter Name");
            String courseName=input.next();

            System.out.println("Enter Fee");
            int courseFee=input.nextInt();

            cour.DisplayCourseDetails(courseId,courseName,courseFee);
        }else{
            System.out.println("Invalid Username Or Password");
        }
    }

    public static void main(String[] args) {
        authenticate("Admin", "1234");
        authenticate("admin","1234");

}

}
