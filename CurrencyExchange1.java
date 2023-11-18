import java.util.Scanner;

public class CurrencyExchange1 {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the exchange rate from dollars to RMB: ");

       		 double exchangerate = input.nextDouble();

		System.out.println(" Enter 0 to convert dollars to RMB and 1 vice versa: ");

		int userInput = input.nextInt();


		if ( userInput == 0 ){
		System.out.println(" Enter the dollar amount: ");
		double dollars = input.nextDouble();
		double dollar = (dollars * exchangerate);
		System.out.printf("%.1f %s %.1f %s%n", dollars," is ", dollar, " Yuan ");
              }

		if ( userInput == 1 ){
		System.out.println(" Enter the RMB amount: ");
		double yuans = input.nextDouble();
		double yuan = (yuans / exchangerate);
		System.out.printf("%.1f %s %s %s%.2f%n", yuans,"yuan", " is ", "$",yuan);
              }
		
		if ( userInput >= 1)
                 System.out.printf("%S%n","Invalid input. Please enter either 0 or 1: ");

	

		
	}

}
		


