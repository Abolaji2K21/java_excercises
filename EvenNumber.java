

import java.util.Scanner;



	public class EvenNumber {

		public static void main(String ... args){

			Scanner input = new Scanner(System.in);

		System.out.println( "ENTER USERINPUT TO CONFIRM IF THE NUMBER IS AN EVEN NUMBER " );


		int userInput = input.nextInt();

	if (userInput % 2 == 0)
		System.out.printf("%s%n", " USERINPUT IS AN EVEN NUMBER ");

	if (userInput % 2 != 0)
		System.out.printf("%s%n", " USERINPUT IS NOT AN EVEN NUMBER ");



	}


}