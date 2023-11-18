 import java.util.Scanner;

	public class DdivByFiveAndSix {

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println( "ENTER INTEGER OF YOUR CHOICE !!! " );

			int userInput = 	input.nextInt();

		if (userInput % 5 == 0 && userInput % 6 == 0) {
			System.out.println( userInput + " IS DIVISIBLE BY 5 AND 6 " + "TRUE" );
		} else {
		if (userInput % 5 != 0 && userInput % 6 != 0)
			System.out.println( userInput + " IS DIVISIBLE BY 5 AND 6 " + "FALSE" );
		}
		

	}

}