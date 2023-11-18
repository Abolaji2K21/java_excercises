import java.util.Scanner ;


	public class Conver {
		
		public static void main(String[] args){
                     final double K = 1.8;
		Scanner input = new Scanner(System.in);

		System.out.println ("ENTER ANY INTEGER IN CELSIUS !!!");

			float celcius = input.nextFloat();

			float result = K*celcius;

			double result2 = result + 32;

		System.out.println("celcius = " + result2);
          }
    }
		