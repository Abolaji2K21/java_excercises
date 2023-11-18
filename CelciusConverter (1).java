import java.util.Scanner;

	public class CelciusConverter {


	public static void main (String... args){

	Scanner input = new Scanner(System.in);

	System.out.printf( " ENTER DEGREE IN CELCIUS " );

		double celcius = input.nextDouble();

		double fahrenheit = (9.0/5) * celcius + 32;

	System.out.println( fahrenheit + " FAHRENHEIT " );


	}
}