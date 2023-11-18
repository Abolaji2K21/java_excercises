

import java.util.Scanner;

	public class Multiples {

		public static void main(String[] args){

		 Scanner input = new Scanner(System.in);

			System.out.print( " ENTER  FIRST INTEGER: " );
	
			 	int firstinteger= input.nextInt();

			System.out.print( " ENTER SECOND INTEGER: " );
				
				int secondinteger= input.nextInt();
	
				int thirdinteger= firstinteger * firstinteger * firstinteger;

				int fourthinteger= secondinteger * secondinteger;

		
		         if (thirdinteger == fourthinteger)
				System.out.println( "THE FIRST INTEGER IS A MULTIPLE OF THE SECOND INTEGER" );
				
		         if (thirdinteger != fourthinteger)
				System.out.println( "THE FIRST INTEGER IS NOT A MULTIPLE OF THE SECOND INTEGER" );

		}



	}