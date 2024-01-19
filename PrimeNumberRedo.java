
import java.util.Scanner;
	public class PrimeNumberRedo{
	private static int userInput;
	private static int counter = 0;
	private static Scanner input = new Scanner(System.in);
	
	
	 	public static void main(String[] args){
		getDisplay();

		}









































	private static void getDisplay(){

	System.out.print("Kindly Enter Any Integer Of Your Choice :");
		userInput = input.nextInt();

		for (int count = 1 ; count < userInput ; count++){


			if( userInput % count == 0){
				counter++;
			}
		}

			if (counter > 1){
	System.out.print("It Is Not A Prime Number");

			} else {

	System.out.print("It Is A Prime Number");

			}

		}
	


	}




