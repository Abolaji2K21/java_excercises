import java.util.Scanner;

	
	public class NumberOfDaysInAMonth {

		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
				
		System.out.println( "ENTER YOUR MONTH AS AN INTEGER!!! " );

			int month = input.nextInt();

		System.out.println( "ENTER YEAR AS AN INTEGER!!! " );

			int year = input.nextInt();


		if ( month == 1 )
		System.out.println( " JANUARY " + year + " HAD 30 DAYS. " );

		if ( month == 2 && year == 4 )
		System.out.println( " FEBRUARY " + year + " HAD 29 DAYS. " );

		if ( month == 2 && year != 4 )
		System.out.println( " FEBRUARY " + year + " HAD 28 DAYS. " );


		if ( month == 3 )
		System.out.println( " MARCH " + year + " HAD 31 DAYS. " );


		if ( month == 4 )
		System.out.println( " APRIL " + year + " HAD 30 DAYS. " );

		if ( month == 5 )
		System.out.println( " MAY " + year + " HAD 31 DAYS. " );

		if ( month == 6 )
		System.out.println( " JUNE " + year + " HAD 30 DAYS. " );

		if ( month == 7 )
		System.out.println( " JULY " + year + " HAD 31 DAYS. " );

		if ( month == 8 )
		System.out.println( " AUGUST " + year + " HAD 31 DAYS. " );

		if ( month == 9 )
		System.out.println( " SEPTEMBER " + year + " HAD 30 DAYS. " );

		if ( month == 10 )
		System.out.println( " OCTOBER " + year + " HAD 31 DAYS. " );

		if ( month == 11 )
		System.out.println( " NOVEMBER " + year + " HAD 30 DAYS. " );

		if ( month == 12 )
		System.out.println( " DECEMBER " + year + " HAD 31 DAYS. " );




		}


	}