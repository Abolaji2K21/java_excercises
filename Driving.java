

import java.util.Scanner;


	public class Driving{

		public static void main(String[] args){

 		  Scanner input = new Scanner(System.in);
		
	 	    System.out.print(" ENTER THE DRIVING DISTANCE!!! ");
		
			double drive = input.nextDouble();
		
		    System.out.print(" ENTER MILES PER GALLON!!! ");
		
			double mile= input.nextDouble();
			
		    System.out.print(" ENTER PRICE PER GALLON!!! ");
	
			double price= input.nextDouble();
			
				double x= drive * price;
				
				double result= x / mile;

		    System.out.println(" THE COST OF DRIVING = " + "$"+result);

	
	
	
	}

	
	
	
	
	
	
}