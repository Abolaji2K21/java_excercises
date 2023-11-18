
import java.util.Scanner;
	
	public class Representation {
		
		public static void main(String[] args){
		
		     Scanner input = new Scanner(System.in);
		
			// ASK USER FOR INPUT 
	
		     System.out.print(" ENTER INTEGER A: ");

			int A = input.nextInt();
		
		     System.out.print(" ENTER INTEGER B: " );

			int B = input.nextInt();
	
		     System.out.print(" ENTER INTEGER C: ");
	
			int C = input.nextInt();

			int D = A + B + C;
		
		     System.out.println(" THE SUM OF ALL USER INPUT = " + D);

			float E = D / 3;

		     System.out.println(" THE AVERAGE MEAN OF ALL USER INPUT = " + E);

			int F = A * B * C;
			
		     System.out.println (" THE PRODUCT OF ALL USER INPUT = " + F);
		       	
			int LARGEST = A;

			int SMALLEST = A;
			
                     if ( B > LARGEST)
			 LARGEST= B;

		    if ( C > LARGEST)
			 LARGEST= C;

		    if ( B < SMALLEST )
			 SMALLEST = B;
	
		    if ( C < SMALLEST)
			 SMALLEST = C;

			System.out.println( "THE LARGEST USERINPUT IS " + LARGEST);
			System.out.println( "THE SMALLEST USERINPUT IS " + SMALLEST);


	}
	
    }