import java.util.Scanner;
	
	public class CheckingAge{
	private static Scanner input = new Scanner(System.in);
	private static int enterYearOfBirth;
	private static int calcualte;
	private static int age;


		public static void main(String... args){
		
		System.out.println();
		System.out.print("Kindly enter the year of birth : ");

		enterYearOfBirth = input.nextInt();

		calcualte = (2024 - enterYearOfBirth);
		
		
		age = calcualte;
		
		System.out.print("Your Current Age Of Birth  is  " +  age + " Years Old");
		
		
		}


	}