import java.util.Scanner;

public class BooleanChecker {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a boolean value (true or false): ");
        boolean userInput = input.nextBoolean();

        if (userInput) {
            System.out.printf("%S%n", "userInput is true");
        }

        if (!userInput) {
            System.out.printf("%S%n", "userInput is false");
        }

        if (userInput) {
            System.out.printf("%S%n", "userInput is true");
        }

        if (!userInput) {
            System.out.printf("%S%n", "userInput is false");
        }

    }
}
