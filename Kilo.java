
import java.util.Scanner;
	
	public class Kilo{

		public static void main(String[] args){
		 final double K = 0.454;
		
		  Scanner input =new Scanner(System.in);
		
		     System.out.print(" Enter The Number in Pounds : ");
			
		        double userInput= input.nextDouble();
			
			 double result= userInput * K;
			 
			System.out.println("HERE IS YOUR CONVERTED POUNDS IN " + result + " kILOGRAMS " );
		 


		}




	}