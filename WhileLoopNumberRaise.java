import java.util.Scanner;

	public class WhileLoopNumberRaise{
		public static void main(String... args){
		
		int userInputA = 0;
		int userInputB = 0; 
		

		Scanner input = new Scanner(System.in);
		
	System.out.print("Enter The First Input Of Your Chioce : " );

	while (input.hasNextInt()){
	userInputA = input.nextInt();

	System.out.print("Enter The Second Input Of Your Chioce : " );
	userInputB = input.nextInt();
	


	double result = Math.pow(userInputA, userInputB);
	System.out.println(result);

	System.out.print("Enter The First Input Of Your Chioce : " );



	}	




























		
	}
}