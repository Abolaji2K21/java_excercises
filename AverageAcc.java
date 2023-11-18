 

import java.util.Scanner;
	
	public class AverageAcc {
	
		public static void main(String[] args){

			Scanner UserInput= new Scanner(System.in);

				System.out.println("ENTER THE FIRST INTEGER FOR v0");
	
					double UserInput1= UserInput.nextDouble();
				
  				System.out.println("ENTER THE FIRST INTEGER FOR v1");

					double UserInput2= UserInput.nextDouble();

  				System.out.println("ENTER THE FIRST INTEGER FOR T");

					double UserInput3= UserInput.nextDouble();
					
					double result = (UserInput1 - UserInput2) / UserInput3;

				System.out.println("AVERAGE ACCELERATION = " + result);



		


						



	}






}