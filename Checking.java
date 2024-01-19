import java.util.Scanner;

	public class Checking{

	public static void main(String... bj){

	   System.out.println("First Gate Pratice Questions : Checking If An Integer  Is Divisible By 3 :");
	   System.out.println("Enter Integer Of Your Choice My Oga :");
	
		Scanner input = new Scanner(System.in);

		int userInput = input.nextInt();
	

		if(userInput % 3 == 0){
		
			System.out.println("Yes Sir ");
		} else {

			System.out.println("No Sir ");

		}
	}
}