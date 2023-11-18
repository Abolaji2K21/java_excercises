import java.util.Scanner;


	
	public class Science {

		public static void main(String[] args){
			final double K = 4184;

		Scanner input = new Scanner(System.in);	
		
		System.out.println( " ENTER THE AMOUNT OF WATER IN KG !!! " );
			float mass= input.nextFloat();
	
		System.out.println( " ENTER THE INITIAL TEMPERATURE !!! " );
			float initialtemperature= input.nextFloat();
		
		System.out.println ( "ENTER THE FINAL TEMPERATURE !!!" );
			float finaltemperature= input.nextFloat();

			double energy = mass * (finaltemperature - initialtemperature) * K;

		System.out.println( "THE ENERGY NEEDED IS = " + energy );

		
			

		}


}