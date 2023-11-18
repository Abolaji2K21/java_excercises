import java.util.Scanner;

public class CheckingValues2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receive five integer inputs from the user
        System.out.println("ENTER EITHER A POSITIVE, NEGATIVE, OR AN INTEGER EQUAL TO ZERO!! ");
        int firstInteger = input.nextInt();
        int positive1 = 0;
        int negative1 = 0;
        int zero1 = 0;

        // Categorize the first input
        if (firstInteger > positive1)
            positive1 = firstInteger;
        else if (firstInteger < negative1)
            negative1 = firstInteger;
        else if (firstInteger == 0)
            zero1 = firstInteger;

        // Repeat the process for the remaining four inputs...

        // Display the results
        System.out.println("RESULT OF POSITIVE INTEGERS INCLUDES : " + positive1 + " ... ");
        System.out.println("RESULT OF NEGATIVE INTEGERS INCLUDES : " + negative1 + " ... ");
        System.out.println("RESULT OF ZERO INTEGERS INCLUDES : " + zero1 + " ... ");
    }
}
