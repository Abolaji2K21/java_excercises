import java.util.Scanner;

	public class Feet {

	public static void main(String[] args) {
	
	double K=1.8 ;
	
	Scanner input = new Scanner(System.in) ;
	
	System.out.print("ENTER INTEGER TO CONVERT: ") ;

	double celcius = input.nextDouble() ;
	
	double result = (celcius * K ) + 32;

	System.out.println( celcius + " celcius is " + result + " Fahrenheit ");

	
	}

}