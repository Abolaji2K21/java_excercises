

import java.util.Scanner;

	
	public class CheckingValus{

		public static void main(String[] args){
		
			Scanner collect = new Scanner(System.in);
	
			System.out.println( "ENTER EITHER A POSTIVE , NEGATIVE OR AN INTEGER EQUAL TO ZERO!! " );
				int firstinteger = collect.nextInt();

			System.out.println( "ENTER EITHER A POSTIVE , NEGATIVE OR AN INTEGER EQUAL TO ZERO!! " );
				int secondinteger = collect.nextInt();

			System.out.println( "ENTER EITHER A POSTIVE , NEGATIVE OR AN INTEGER EQUAL TO ZERO!! " );
				int thirdinteger = collect.nextInt();

			System.out.println( "ENTER EITHER A POSTIVE , NEGATIVE OR AN INTEGER EQUAL TO ZERO!! " );
				int fourthinteger = collect.nextInt();

			System.out.println( "ENTER EITHER A POSTIVE , NEGATIVE OR AN INTEGER EQUAL TO ZERO!! " );
				int fifthinteger = collect.nextInt();


			int positive = 0;
			int negative = 0;
			int zero     = 0;



	
			if ( firstinteger > 0 )
			  positive = positive + 1;
		
			if ( firstinteger < 0 )
			  negative = negative + 1;

			if ( firstinteger == 0 )
			  zero     = zero + 1;

			if ( secondinteger > 0 )
			  positive = positive + 1;
		
			if ( secondinteger < 0 )
			  negative = negative + 1;

			if ( secondinteger == 0 )
			  zero   = zero + 1;

			if ( thirdinteger > 0  )
			  positive = positive + 1;
		
			if ( thirdinteger < 0 )
			  negative = negative + 1;

			if ( thirdinteger == 0 )
			  zero = zero + 1;

			if ( fourthinteger > 0 )
			  positive = positive + 1;
		
			if ( fourthinteger < 0 )
			  negative = negative + 1;

			if ( fourthinteger == 0 )
			  zero  = zero + 1;

			if ( fifthinteger > 0 )
			  positive = positive + 1;
		
			if ( fifthinteger < 0 )
			  negative = negative + 1;

			if ( fifthinteger == 0 )
			  zero  = zero + 1;



		System.out.println( "THE TOTAL NUMBER OF POSITIVE NUMBER = " + positive );
		System.out.println( "THE TOTAL NUMBER OF NEGATIVE NUMBER = " + negative );
		System.out.println( "THE TOTAL NUMBER OF ZERO NUMBER = " + zero );




		 


				



		

		




		}
	
	}