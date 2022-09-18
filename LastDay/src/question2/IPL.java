package question2;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium){

        if(stadium != null) {

            stadium.message();

        }
        else {
        	
            System.out.println("invalid stadium");
            
        }
   }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter stadium name:");
        String name= input.next();

        Stadium s1=Stadium.valueOf(name.toUpperCase());

        IPL season=new IPL();

        season.homeTeamStadium(s1);

    }
}


