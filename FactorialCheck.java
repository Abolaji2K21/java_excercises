import java.util.Scanner;

	public class FactorialCheck{
		private static Scanner input = new Scanner(System.in);	
		private static int userInput;
		private static int result = 1;



		public static void main (String... args){
		
		System.out.println("Enter Any Interger Of Your Choice :" );

		  if (input.hasNextInt()) {
            	userInput = input.nextInt();

            	  if (userInput < 1 || userInput > 1000) {
                System.out.println("Enter a valid number between 1 and 1000.");

            	} else {

		for(int collect = userInput ; collect > 0; collect--){
                 	result *= collect ;
                }

		System.out.println("Factorial is  " + result );


            	}


       		} else {

            	System.out.println("Enter a valid integer ");
            	userInput = input.nextInt();
		
       		}

	


		


		}



	}