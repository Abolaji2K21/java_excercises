import java.util.Scanner;

	
	public class NumberOfYearsToDays {

		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
				
		System.out.println( "ENTER THE NUMBER OF YEARS AS AN INTEGER!!! " );

			int years= input.nextInt();

			int days = years * 365;

		System.out.println( years+ "YEARS = !!! " + days + " DAYS !!! " );




		}


	}