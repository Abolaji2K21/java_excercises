
import java.util.Scanner;

	public class Size {

		public static void main(String[] args){
			Scanner input= new Scanner(System.in);
		
		System.out.println( "ENTER FIRST INTEGERS");
			int FIRST = input.nextInt();

		System.out.println( "ENTER SECOND INTEGERS");
			int SECOND = input.nextInt();

		System.out.println( "ENTER THIRD INTEGERS");
			int THIRD = input.nextInt();

		System.out.println( "ENTER FOURTH INTEGERS");
			int FOURTH = input.nextInt();

		System.out.println( "ENTER FIFTH INTEGERS");
			int FIFTH = input.nextInt();

			 int LARGEST = FIRST;
                          int SMALLEST = FIRST;

		         if ( SECOND > LARGEST) 
		            LARGEST = SECOND;
		
		         if ( THIRD > LARGEST)
		             LARGEST = THIRD;

		         if ( FOURTH > LARGEST)
		             LARGEST = FOURTH;

                          if ( FIFTH > LARGEST)
		              LARGEST = FOURTH;

		         if ( SECOND < SMALLEST)
		             SMALLEST = SECOND;

		         if ( THIRD < SMALLEST)
		             SMALLEST = THIRD;

		         if ( FOURTH < SMALLEST)
		             SMALLEST = FOURTH;

                         if ( FIFTH < SMALLEST)
		             SMALLEST = FIFTH;
      	

		System.out.println( "THE LARGEST USERINPUT IS : " + LARGEST);

		System.out.println( "THE SMALLEST USERINPUT IS : " + SMALLEST);

	}
}