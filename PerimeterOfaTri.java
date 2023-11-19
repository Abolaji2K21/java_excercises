import java.util.Scanner;
	
	public class PerimeterOfaTri {
	
		public static void main(String... args){

			Scanner input = new Scanner(System.in);

		System.out.println("ENTER USERINPUT A");
			int userInputA= input.nextInt();

		System.out.println("ENTER USERINPUT B");
			int userInputB = input.nextInt();

		System.out.println("ENTER USERINPUT C");
			int userInputC  = input.nextInt();


		int perimeterOfATri = userInputA + userInputB + userInputC  ;

		int sumAandB = userInputA + userInputB;
		int sumBandC = userInputC + userInputB;
		int sumAandC = userInputA + userInputC;

		//System.out.println(sumAandC);



		if ( sumAandB > userInputC ){
			
			if ( sumBandC > userInputA )
				
				if ( sumAandC > userInputB )
	
				{	
					System.out.println("VALID");
					System.out.println(perimeterOfATri); 
				}
			} else {

					System.out.println( "INVALID INPUT" );


		}

		

	}



}