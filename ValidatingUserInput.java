import java.util.Scanner;

    public class ValidatingUserInput{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		int userInput = 0;
		
		
		while ((userInput !=1) && (userInput !=2)){

		System.out.print("Enter Any Number Of Your Chioce Apart From 1 or 2: ");
		userInput = input.nextInt();


		}

		
	}
}