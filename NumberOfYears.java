 

import java.util.Scanner;
	
	
	
	public class NumberOfYears {

		public static void main(String args[]){

		 Scanner collect = new Scanner(System.in);

		System.out.println( "ENTER THE INTEGERS OF YOUR CHOICE IN MUNITES" );
	
			int userinput= collect.nextInt();
		
			int years = userinput / 525600 ;
			int remainder = userinput % 525600 ;
			int day = remainder / 1440 ;

		System.out.println( userinput + " MUNITES IS APPROXIMATELY " + years + " YEARS  " +  day  + " DAYS ");



	

	
		}



	}