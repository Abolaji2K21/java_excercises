import java.util.Scanner;

	public class inputedValues{

		private static Scanner input = new Scanner(System.in);


		private static int positive;
		private static int negative;
		private static int zero;


		private static void getDisplayall(){

		System.out.println("First Gate Pratice Questions : Writing A Code To Determine Who And Where The Values Will Fit  :");

	System.out.println("My Oga Oya Kindly Enter All Of The Integers You Intend To Check ");

		for(int count = 0; count < 5; count++){
	System.out.print("Enter Integer #" + (count + 1) + ":");
		int userInput = input.nextInt();

			if (userInput > 0){
				positive = positive + 1;
			} 
			if (userInput < 0){
				negative = negative + 1;
			} 

			if (userInput == 0){
				zero = zero + 1;
			} 



		}

	System.out.println("The Total Number Of positive : " + positive );
	System.out.println("The Total Number Of negative : " + negative );
	System.out.println("The Total Number Of  zero : " + zero );



	}

		public static void main(String... bj){

		getDisplayall();

	}



}