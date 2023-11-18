
import java.util.Scanner;

	public class Circle{

		public static void main(String[] args){
			final double K = 3.14159;

			Scanner input = new Scanner(System.in);
			
			System.out.print( "ENTER RADIUS : " );

			int radius = input.nextInt();
			
			int diameter = 2 * radius ;
			
			System.out.println( "THE DIAMETER OF RADIUS " + radius + " IS = " + diameter );
			
			double circumference = 2 * K * radius ;
	
			System.out.println( "THE CIRCUMFERENCE OF RADIUS " + radius + " IS = " + circumference );
			
			double area = K * ( radius * radius );
	
			System.out.println( "THE AREA OF RADIUS " + radius + " IS = " + area );

			

	
	}
	
	
	
	

}