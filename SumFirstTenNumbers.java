import java.util.Scanner;
	
	public class SumFirstTenNumbers{
	private static Scanner input = new Scanner(System.in);
	private static int sum;


		public static void main(String... args){
		

			System.out.println();
		System.out.print("This app callculates  the sum of the first 10 natural numbers ");
			System.out.println();


			for(int collect = 0; collect < 10 ; collect++){

				sum += collect;

			}
			System.out.println();
			System.out.println("Total is " + sum);

		
		}

	}