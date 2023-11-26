	import java.util.Scanner;

public class PyramidConstructionEstimate {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the estimated number of stones used: ");
        int numberOfStones = scanner.nextInt();

        System.out.print("Enter the average weight of each stone (in pounds): ");
        double averageStoneWeight = scanner.nextDouble();

        System.out.print("Enter the number of years taken to build the pyramid: ");
        int numberOfYears = scanner.nextInt();


        double totalWeight = numberOfStones * averageStoneWeight;
        double weightBuiltPerYear = totalWeight / numberOfYears;
        double weightBuiltPerHour = weightBuiltPerYear / (numberOfYears * 24);
        double weightBuiltPerMinute = weightBuiltPerHour / 60;

        System.out.println("Construction Estimate for the Great Pyramid of Giza:");
        System.out.printf("Total weight of the pyramid: %.2f pounds%n", totalWeight);
        System.out.printf("Weight built per year: %.2f pounds%n", weightBuiltPerYear);
        System.out.printf("Weight built per hour: %.2f pounds%n", weightBuiltPerHour);
        System.out.printf("Weight built per minute: %.2f pounds%n", weightBuiltPerMinute);
    }
}
