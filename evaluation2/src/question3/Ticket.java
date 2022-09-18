package question3;

public class Ticket {
	 int ticketid;
	    int price;
	    static int availableTickets;

	    public int calculateTicketCost(int nooftickets){
	        if(this.availableTickets>=1){
	            this.availableTickets-=nooftickets;
	            int totalAmount=(nooftickets*this.price);

	            return totalAmount;
	        }
	        else {
	            return -1;
	        }
	    }

}
