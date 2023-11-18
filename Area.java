
import java.util.Scanner;
	
	public class Area {

		public static void main(String[] args) {
		             // DECLEAR A CONSTANT OF PI;
		    final double PI= 3.142 ;

		       Scanner input = new Scanner(System.in);
		
		           // AREA OF A CIRCLE IS TTR SQUARE THUS R*R*3.142

		   System.out.println("Enter the Radius");

		int userInput= input.nextInt();
		
		
		double result = userInput * userInput * PI;

System.out.println("Area of the circle with an input "+ userInput + " is ");


System.out.println(result);
		
		
		
		
		




		}







	} 