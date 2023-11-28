import java.util.Scanner;

public class ScoreOfStudent {

    public static void main(String[] args) {

        int largestScores = 0;
        String studentWithHighestScores = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Names and Scores. Enter 'stop' to end input.");

        String userInput = "";

        while (!userInput.equals("stop")) {
            System.out.println("Enter Student Name:");
            userInput = input.next();

            if (!userInput.equals("stop")) {
                System.out.println("Enter Score For " + userInput);
                int scores = input.nextInt();

                if (scores > largestScores) {
                    largestScores = scores;
                    studentWithHighestScores = userInput;
                }
            }
        }

        if (largestScores > 0) {
            System.out.println(studentWithHighestScores + " Has The Highest Scores Of: " + largestScores);
            System.out.println(studentWithHighestScores + " Congratulations Once Again ");
            System.out.println(studentWithHighestScores + " Enjoy Your Achievement As Well As Your Plans");
        } else {
            System.out.println("No student information provided.");
        }
    }
}
