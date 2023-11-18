

import java.util.Scanner;

	public class Display{

		public static void main(String[] args){
				
		// wRITING A PROGRAM THAT WILL CONVERT SECONDS TO TIMES 
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("ENTER INTEGER IN SECONDS");
		
		int userInput= input.nextInt();

		int minute = userInput / 60;
		
		int remainingSeconds = userInput % 60;

		System.out.println("Here is Your Answer: "  + minute + " minutes and "  + remainingSeconds  + " Seconds ");
	





	}



 
}
	