import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ASK FOR EXCHANGE RATE");

        double exchangeRate = input.nextDouble();

        System.out.print("ENTER 0 TO CONVERT DOLLARS TO RMD OR 1 TO CONVERT YUAN TO DOLLARS: ");

        int userChoice = input.nextInt();

        if (userChoice == 0) {
            System.out.print("Enter the amount in dollars: ");
            double userInput = input.nextDouble();
            double RMD = userInput * exchangeRate;

            System.out.printf("$%.1f is %.1f yuan%n", userInput, RMD);

        } else if (userChoice == 1) {
            System.out.print("Enter the amount in yuan: ");
            double userInputYuan = input.nextDouble();
            double dollars = userInputYuan / exchangeRate;

            System.out.printf("%.2f yuan is $%.2f%n", userInputYuan, dollars);
        } else {
            System.out.println("Invalid input. Please enter either 0 or 1.");
      

}


}


}
