
import java.util.Scanner;

	
	public class DivByFiveAndSix {

		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
				
		System.out.println( "ENTER INTEGER OF YOUR CHOICE !!! " );
			int choice = input.nextInt();

		boolean divbyfiveandsix = (choice % 5 == 0) && (choice % 6 == 0);

		boolean divbyfiveorsix  = (choice % 5 == 0) || (choice % 6 == 0);

		boolean divbyfivebothsix  = (choice % 5 == 0) ^ (choice % 6 == 0);




	System.out.println( " IS " + choice + " DIVISIBLE BY 5 AND 6 :" + divbyfiveandsix);
	System.out.println( " IS " + choice + " DIVISIBLE BY 5 OR 6 :" + divbyfiveorsix);

	System.out.println( " IS " + choice + " DIVISIBLE BY 5 OR 6, BUT NOT BOTH :" + divbyfivebothsix);


	}


}