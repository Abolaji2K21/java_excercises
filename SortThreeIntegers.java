import java.util.Scanner;

public class SortThreeIntegers {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER ANY INPUT OF YOUR CHOICE: ");
        int userInput1 = input.nextInt();

        System.out.println("ENTER ANY INPUT OF YOUR CHOICE AGAIN: ");
        int userInput2 = input.nextInt();

        System.out.println("ENTER ANY INPUT OF YOUR CHOICE AGAIN: ");
        int userInput3 = input.nextInt();

        int highestInput = userInput1;
	  int lowestInput  = userInput1;
	  int middleInput  = userInput1;

        highestInput = lowestInput = userInput1;

        if (userInput2 > highestInput) {
            highestInput = userInput2;
        }
        if (userInput3 > highestInput) {
            highestInput = userInput3;
        }
        if (userInput2 < lowestInput) {
            lowestInput = userInput2;
        }
        if (userInput3 < lowestInput) {
            lowestInput = userInput3;
        }

        if (userInput1 != highestInput && userInput1 != lowestInput) {
            middleInput = userInput1;
        }
        if (userInput2 != highestInput && userInput2 != lowestInput) {
            middleInput = userInput2;
        }
        if (userInput3 != highestInput && userInput3 != lowestInput) {
            middleInput = userInput3;
        }

        System.out.println("Lowest Input: " + lowestInput);
        System.out.println("Middle Input: " + middleInput);
        System.out.println("Highest Input: " + highestInput);

   
    }
}
