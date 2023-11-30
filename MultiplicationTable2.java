import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int result = 0;

        System.out.print("Enter Integer Ranging From 1 - 10: ");

        if (input.hasNextInt()) {
            int userInput = input.nextInt();
	

            if (userInput < 1 || userInput > 10) {
                System.out.println("Enter a valid number between 1 and 10.");
            } else {
                while (counter <= 12) {
                    result = userInput * counter;
                    System.out.println(userInput + " * " + counter + " = " + result);
                    counter++;
                }
            }
        } else {
            System.out.println("Enter a valid integer between 1 and 10.");
        }
    }
}
