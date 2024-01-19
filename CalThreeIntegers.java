import java.util.Scanner;
	public class CalThreeIntegers{

		public static void main(String... bj){

System.out.println("First Gate Pratice Questions : Writing A Calculator :");
System.out.println(" Kindly Enter Any Three Integer Of Your Choice:");

		Scanner input = new Scanner(System.in);

	       int largest = -2000000;
	       int smallest = 2000000;
	       int product = 1;
	       int sum = 0;
	       int average = 0;


		for(int count = 0; count < 3; count++){
System.out.println(" Kindly Enter the integer #" + (count + 1) + ":");
		int userInput = input.nextInt();
		product *= userInput;

		sum += userInput;
		

		     if (userInput > largest){
			largest = userInput;

			}

		     if (userInput < smallest){
			smallest = userInput;

			}

		}
		
		average = sum / 3 ;


	System.out.println("Largest Number = " + largest);
	System.out.println("Smallest Number = " + smallest);
	System.out.println("Sum Of All Three Numbers = " + sum);
	System.out.println("Product Of All Three Numbers = " + product);
	System.out.println("Average Of All Three Numbers = " + average);





	}
	
}
	