package evaluation;


	
	public class Main {

		


		   public void printMonths(String month){

			   
			   switch(month) {
			   case "JAN":
		           System.out.println("This is the 1st Month of the Year January");
		       break;
			   case"FEB":
		           System.out.println("This is the 2nd Month of the Year February");
		           break;
			   case "MAR":
		           System.out.println("This is the 3rd Month of the Year March");
		           break;
			   case "APR":
		           System.out.println("This is the 4th Month of the Year April");
		           break;
			   case"MAY":
		           System.out.println("This is the 5th Month of the Year May");
		           break;
			   case"JUN":
		           System.out.println("This is the 6th Month of the Year June");
		           break;
			   case "JUL":
		           System.out.println("This is the 7th Month of the Year July");
		           break;
			   case"AUG":
		           System.out.println("This is the 8th Month of the Year August");
		           break;
			   case "SEP":
		           System.out.println("This is the 9th Month of the Year September");
		           break;
			   case "OCT":
		           System.out.println("This is the 10th Month of the Year October");
		           break;
			   case "NOV":
		           System.out.println("This is the 11th Month of the Year November");
		       
			   case "DEC":
		           System.out.println("This is the 12th Month of the Year December");
		           break;
			    default:System.out.println("may be some other month");
			   }
		   }
		    public static void main(String[] args) {

		         String month="DEC";

		        Main obj=new Main();

		        obj.printMonths(month);

		    }
		}

