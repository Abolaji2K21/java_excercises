
import java.util.Scanner;
	
	public class Interest {

	   public static void main(String[] args) {

	      Scanner userInput= new Scanner(System.in);

		System.out.print("Prompt value1: " );

	 	   double value1 = userInput.nextDouble();
	
		      double x =  value1 / 1200;
		
			System.out.print("prompt value2");
			
			    double value2 = userInput.nextDouble();
		   		
				double result = value2 * x;
				
				   System.out.println(" Interest = " + result);
			       
		
			 



	}






}