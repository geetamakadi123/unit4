package question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input=new Scanner(System.in);

	        System.out.println("Enter no of bookings:");
	        int num= input.nextInt();

	        System.out.println("Enter the available tickets:");

	        Ticket.availableTickets= input.nextInt();

                     for(int i=0;i<num;i++) {

	                 Ticket obj = new Ticket();

	                 System.out.println("Enter the ticketid:");
	                 obj.ticketid = input.nextInt();

	                 System.out.println("Enter the price:");
	                 obj.price = input.nextInt();

	                 System.out.println("Enter the no of tickets:");
	                 int numb = input.nextInt();
	                 
	                 System.out.println("Available tickets  "+Ticket.availableTickets);

	                 int total = obj.calculateTicketCost(numb);
	                 System.out.println("Total amount: " + total);
	                 
	                 

	                 System.out.println("Available ticket after booking: "+Ticket.availableTickets);
	             }



	    }
	}
	


