


import java.util.Scanner;
	
	public class SeparatingDigits{

		public static void main(String[] args){
		
		 Scanner input= new Scanner(System.in);
		
		   System.out.printf("%S%n", "ENTER AN INTEGER CONSISTING OF 5 DIGITS");
			
			int digit = input.nextInt();
	
			int digit1= (digit / 10000 )% 10;
			int digit2= (digit / 1000  ) % 10;
			int digit3= (digit / 100	  ) % 10;
			int digit4= (digit / 10    )  % 10;	
			int digit5= digit % 10;

		   System.out.printf("%d  %d  %d  %d  %d	%n", digit1, digit2,  digit3,  digit4,  digit5);
		}





	}
	