import java.util.Scanner;
	import java.util.Random;

	public class lottery {

		public static void main(String... args){
			
			Scanner input = new Scanner(System.in);
        System.out.print("Enter your three-digit lottery guess: ");
			int userGuess = input.nextInt();


			Random lot = new Random();
        	int lottery = (int) (Math.random() * 1000);


			int lotteryDigit0 = 	(lottery / 100);
			int lotteryDigit1 =	(lottery / 10) % 10;
			int lotteryDigit2 =	(lottery % 10);

			int userGuessDigit0 =  (userGuess / 100 );
			int userGuessDigit1 =  (userGuess / 10 ) %10;
			int userGuessDigit2 =  (userGuess % 10 );

        		boolean won = false;


			if (lottery == userGuess ){
				System.out.println ("YOU HAVE JUST WON YOUR SELF $10000");
			}

			if ((userGuessDigit0 == lotteryDigit0 || userGuessDigit0 == lotteryDigit1 || userGuessDigit0 == lotteryDigit2) &&
				 (userGuessDigit1 == lotteryDigit0 || userGuessDigit1 == lotteryDigit1 || userGuessDigit1 == lotteryDigit2) &&
					(userGuessDigit2 == lotteryDigit0 || userGuessDigit2 == lotteryDigit1 || userGuessDigit2 == lotteryDigit2)){
						
						System.out.println ("YOU HAVE JUST WON YOURSELF $3000");
            						won = true;
			}
		

			if ((userGuessDigit0 == lotteryDigit0 && userGuessDigit0 != lotteryDigit1 && userGuessDigit0 != lotteryDigit2) &&
				
				(userGuessDigit1 == lotteryDigit0 && userGuessDigit1 != lotteryDigit1 && userGuessDigit1 != lotteryDigit2) &&
			
					(userGuessDigit2 == lotteryDigit0 && userGuessDigit2 != lotteryDigit1 && userGuessDigit2 != lotteryDigit2)){
				
						System.out.println ("YOU HAVE JUST WON YOURSELF $1000");
            						won = true;

			}
        		if (!won) {
          				     System.out.println("Sorry, you did not win. Try again!");
            					
			}
	

	}



}