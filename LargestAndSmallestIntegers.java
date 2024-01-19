import java.util.Scanner;
import java.lang.Integer;
	public class LargestAndSmallestIntegers{

	   public static void main(String... args){
	   Scanner input = new Scanner(System.in);

	   System.out.println("First Gate Pratice Questions : Checking For The Largest And Smallest Questions :");
	   
           System.out.println("Kindly Enter Any Five Integers Of Your Choice :");

       		int largest = Integer.MIN_VALUE; 
		int smallest = Integer.MAX_VALUE; 

		for(int count = 0;count < 5 ; count++){
            System.out.print("Enter integer #" + (count + 1) + ": ");
		int currentValue = input.nextInt();	

			if (currentValue > largest){
			largest = currentValue;
			}
				
			if (currentValue < smallest){
			smallest = currentValue;
			}
		
		}


        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + Integer.MIN_VALUE);


	}
}


