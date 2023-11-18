

import java.util.Scanner;

	public class FeetConvert {

		public static void main(String[] args){

		// CONVERSION FEET TO METER 
		
		final double K= 0.305 ;	
	
		Scanner input= new Scanner(System.in);

		System.out.println("ENTER INTEGER TO CONVERT ");

		double userInput = input.nextDouble();
			
		double result = userInput * K ;
		
		System.out.printf("THE CONVERTED VALUE OF THE USER INPUT IS %f ", result);
		
		
	}



}