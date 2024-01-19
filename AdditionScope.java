import java.util.Scanner;

	public class AdditionScope{
		private static Scanner input = new Scanner(System.in);	
		private static int userInputA;
		private static int userInputB;
		private static int result;



		public static void main(String... args){
		
	System.out.print("Kindly enter the first Integer: ");
		userInputA = input.nextInt();

	System.out.print("Kindly enter the first Integer: ");
		userInputB = input.nextInt();

		if (userInputA < 0 && userInputB > 0 ){
			userInputA = (userInputA * -1);

		for(int count = 0; count <userInputB ; count++ ){
			result += userInputA;

		}
		
		} else if (userInputB < 0 && userInputA > 0 ){
			userInputB = (userInputB * -1);
		for(int count = 0; count <userInputB ; count++ ){
			result += userInputA;

		}

		}
		
	System.out.print("Here Is The Magic " + result);


		}


	}


