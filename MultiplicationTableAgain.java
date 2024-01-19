import java.util.Scanner;

public class MultiplicationTableAgain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int count = 1;
        int result = 0;

        for (counter = 1; counter <= 12; counter++) {
            for (count = 1; count <= 12; count++) {
                result = counter * count;
                System.out.print(count + " * " + counter + " = " + result + "\t");
            }
            System.out.println();
        }
    }
}
