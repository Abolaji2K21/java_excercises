

import java.util.Scanner;

	
	public class FeetNew{

		public static void main(String[] args){
			final double k = 0.305;

			Scanner userinput = new Scanner(System.in);
			
			System.out.println("ENTER INTEGER TO CONVERT TO METER");

			double userInput= userinput.nextDouble();
			
			double result= userInput * k;

			System.out.println("HERE IS THE CONVERTED VALUE OF USER-INPUT");

			System.out.println(result + " meters ");


	}




}