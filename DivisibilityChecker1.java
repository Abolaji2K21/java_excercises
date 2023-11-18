import java.util.Scanner;


	public class DivisibilityChecker1 {
		
		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			
		System.out.println( "ENTER USER FOR INPUT: " );

		int userinput = input.nextInt();

		
		boolean divideby5 = userinput % 5 == 0;

		boolean divideby6 = userinput % 6 == 0;

		System.out.println( userinput + "CHECKING: " + divideby5);
		System.out.println( userinput + "CHECKING: " + divideby6);
		System.out.println( userinput + "CHECKING: " + (divideby5 || divideby6));

		 


		}



	}



