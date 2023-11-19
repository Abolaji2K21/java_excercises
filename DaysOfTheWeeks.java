import java.util.Scanner;

	public class DaysOfTheWeeks{
	
		public static void main(String... args){

			Scanner input = new Scanner(System.in);

			System.out.println("ENTER YEAR: ");
			int year = input.nextInt();

			System.out.println("ENTER MONTH:");
			int month = input.nextInt();

			System.out.println("ENTER DAYS OF THE MONTH:");
			int days = input.nextInt();

			int j = year / 100;

			int k = year % 100;

			int a = (days + (26*(month +1)/10) + (year % 100) + ((year % 100)/4) + ((year / 100)/4) + (5*(year / 100))); 	
			
			int h = a % 7;

			if (h == 0)
				System.out.println("DAY OF THE WEEK IS SATURDAY");

			if (h == 1)
				System.out.println("DAY OF THE WEEK IS SUNDAY");

			if (h == 2)
				System.out.println("DAY OF THE WEEK IS MONDAY");

			if (h == 3)
				System.out.println("DAY OF THE WEEK IS TUESDAY");

			if (h == 4)
				System.out.println("DAY OF THE WEEK IS WEDNESDAY");

			if (h == 5)
				System.out.println("DAY OF THE WEEK IS THURSDAY");

			if (h == 6)
				System.out.println("DAY OF THE WEEK IS FRIDAY");



			
		}



	}