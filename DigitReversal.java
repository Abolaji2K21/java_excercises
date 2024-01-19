import java.util.Scanner;

	public class DigitReversal{
	private static Scanner input = new Scanner(System.in);
	private static int digit;
	private static int digit1;
	private static int digit2;
	private static int digit3;
	private static int digit4;
	private static int digit5;


	

		public static void main(String... args){
		getDisplayAll();


		}
		






























		private static void getDisplayAll(){

		System.out.print("Kindly Enter Any Five Integers Of Your choice: " );

			 digit = input.nextInt();
	
			digit1= (digit / 10000 )% 10;
			digit2= (digit / 1000  ) % 10;
			digit3= (digit / 100	  ) % 10;
			digit4= (digit / 10    )  % 10;	
			digit5= digit % 10;

		   System.out.println("Here Is The Your Reversed Digit : " + digit5+digit4+digit3+digit2+digit1);

		}
	}