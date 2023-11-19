import java.util.Scanner;
	import java.util.Random;

	public class CoinFlip {

		public static void main(String... args){
			
			Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess between 0 and 1 : ");
			int userGuess = input.nextInt();


			Random random = new Random();
        	int coinResult = random.nextInt(2);
		
	if (userGuess == coinResult) {
		System.out.println("Congratulations! Your guess is correct.");
	}
	if (userGuess != coinResult) {
		System.out.println("Sorry! Your guess is incorrect.");
	}
  }

}