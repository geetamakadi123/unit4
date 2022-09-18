//Q2) One of the least Insurance agencies recruited employees for their collection
//department. Now the HR needs a report as the average age of all the employees
//working in that department. Write a code to calculate the average age.
//Implement a method "calculateAverage(int[] age)" to calculate the average age and
//return the result to the caller function.
//Note : Minimum of 2 employees is mandatory to calculate average age, if fails, the output
//should be "Please enter a valid employee count"
//Refer the sample given for read and display the output
//

package question2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {

	 double calculateAverage(int[] age)
     {
         int len=age.length;
         double sum=0.0;
         for(int i=0;i<len;i++)
         {
             sum+=age[i];
         }
         double avg=sum/len;
         return avg;
     }
	 

     public static void main (String[] args) {
         Scanner sc =new Scanner(System.in);
         Employee obj=new Employee();

         System.out.println("Enter total no.of employees:");
         int n=sc.nextInt();
         
       //  System.out.println();
         int flag=0;
         if(n>1)
         { int[] age=new int[n];
             System.out.println("Enter the age for "+n+" employees:");

             for(int i=0;i<n;i++)
             {
                 int temp=sc.nextInt();
                 if(temp>=28 && temp<=40)
                 {
                     age[i]=temp;
                 }
                 else
                 {
                     System.out.println("Invalid age encountered!");
                     flag++;
                     break;
                 }
             }

             if(flag==0)
             {   DecimalFormat df=new DecimalFormat("####.00");
                 System.out.println("The average age is "+df.format(obj.calculateAverage(age)));
             }
         }
         else
         {
             System.out.println("Please enter a valid employee count");
         }
     }
}
