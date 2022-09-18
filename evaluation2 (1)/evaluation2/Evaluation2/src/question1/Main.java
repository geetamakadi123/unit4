package question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Number of Students you want to enter");
        int num=input.nextInt();



        for(int i=0;i<num;i++){

            System.out.println("Enter the Roll Number :");
            int roll=input.nextInt();


            System.out.println("Enter the Name :");
            String name= input.next();

            System.out.println("Enter the marks :");
            int marks= input.nextInt();


            System.out.println("student Details "+(i+1));
            Student obj=new Student(roll,name,marks);

            System.out.println("Student Roll Number: "+obj.rollNumber);
            System.out.println("Student Name: "+obj.studentName);
            System.out.println("Student Mark: "+obj.marks);

        }


    }
}
