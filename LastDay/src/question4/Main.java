package question4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your date of form in the dd-MM-yyyy format : ");

	        System.out.println("Enter the Start date of Form : ");
	        
	        String startDate = sc.next();
	        
	        System.out.println("Enter the End date of Form : ");
	        
	        String endDate = sc.next();

	        try {
	            LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	            LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	            Period NoOfDays = Period.between(start, end);

	            if (start.getDayOfMonth() <= end.getDayOfMonth()) {
	                System.out.println(NoOfDays);
	            } else {
	                System.out.println("Alert!!!!" + " : Start date should be smaller than End date");
	            }

	        } catch (Exception e) {

	            System.out.println("Please enter date in dd-MM-yyyy format");
	        }

	    }

}
