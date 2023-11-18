

import java.util.Scanner;

	public class Length{

	   public static void main(String[] args){

	     Scanner input=new Scanner(System.in);
	
	       System.out.print(" ENTER INPUT FOR VELOCITY!!! ");
	
		int userInput=input.nextInt();
	
		int velcoity= userInput * userInput;
		
		  System.out.print(" ENTER INPUT FOR ACCELERATION!!! ");

		    double userInput2= input.nextDouble();

		    double a= 2 * userInput2;

			double result = v / a;

			  System.out.println(" THE MINIMUM RUNWAY LENGHT IS = " + result);
	
	
	}

}


