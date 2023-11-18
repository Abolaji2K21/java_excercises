
import java.util.Scanner;

	public class DivisibleByThree{

		public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print( "ENTER AN INTEGER !!!" );

		float userinput= input.nextFloat();
	
		float result =  ( userinput / 3) ; 

		if (userinput % 3 == 0)
			System.out.println( " USER INPUT IS DIVISIBLE BY 3 : ");

	
		if (userinput % 3!= 0)	
			System.out.println( "USER INPUT IS NOT DIVISIBILE BY 3 : ");
					System.out.println( result);


		}

	}