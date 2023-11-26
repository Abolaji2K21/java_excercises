import java.util.Scanner;

public class SimpleBMICalculator {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        double bmiResult = (weightPounds / (heightInches * heightInches)) * 703;

        System.out.printf("Your BMI is: %.2f%n", bmiResult);

        if (bmiResult < 18.5) {
            System.out.println("BMI Category: Underweight");
        }
        if (bmiResult >= 18.5 && bmiResult < 25) {
            System.out.println("BMI Category: Normal weight");
        }
        if (bmiResult >= 25 && bmiResult < 30) {
            System.out.println("BMI Category: Overweight");
        }
        if (bmiResult >= 30) {
            System.out.println("BMI Category: Obese");
        }
    }
}
