import java.util.Scanner;

	public class SepartDigit{
		public static void main (String... bj){
		
System.out.println("First Gate Pratice Questions : Writing A Seperating  :");

       System.out.print("Enter Integer Of Your Choice My Oga :");

		Scanner input = new Scanner(System.in);

		int userInput = input.nextInt();

		int digit = (userInput /10000) % 10;
		int digit1 = (userInput /1000) % 10;
		int digit2 = (userInput /100) % 10;
		int digit3 = (userInput /10) % 10;
		int digit4 = (userInput % 10);	

		System.out.println();
       System.out.print("Here Is The Seperating Integers: " + digit + " " + digit1 + " " + digit2 + " " + digit3 + " " + digit4);


	}


}