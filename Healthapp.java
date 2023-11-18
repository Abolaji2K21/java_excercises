
import java.util.Scanner;


	public class Healthapp {
		
		public static void main(String[] args){
			final double K = 703;

			Scanner input = new Scanner(System.in);

		System.out.println( "INPUT WEIGHT IN POUNDS!! " );
			float weight= input.nextFloat();
		
		System.out.println( "INPUT HEIGHT IN METERS!! " );
			int height = input.nextInt();

			float heightsq= height * height; 

			double BMI = (weight / heightsq) * K ;


		System.out.println( "BMI = " + BMI );

	
	
	
		}

	
	
	} 