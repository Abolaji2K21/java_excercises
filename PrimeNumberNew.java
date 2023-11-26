import java.util.Scanner;

	public class PrimeNumberNew{
		
	  public static void main(String[] args){

		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter Any Positive Number Choice To Check If The Number Is A Prime Number ");
			int primeNumber = input.nextInt();

		while ( primeNumber != 0 ) {

			 while (primeNumber != 0) {

           		 if (primeNumber < 1) {
               		 System.out.println("Enter A Positive Number ");
			 primeNumber = input.nextInt();	

          	         } else if (primeNumber < 13) {
                	 if ((primeNumber == 2) || (primeNumber == 3) || (primeNumber == 5) || (primeNumber == 7) || (primeNumber == 11)) {
			System.out.println("It is a prime number ");
			System.out.println("");
			System.out.println("Enter Any Positive Number Choice To Check If The Number Is A Prime Number ");
			primeNumber = input.nextInt();

                	} else {
                    	System.out.println("It is not a prime number ");
			System.out.println("Enter Any Positive Number Choice To Check If The Number Is A Prime Number ");
			primeNumber = input.nextInt();
               	        }

            		} else if ((primeNumber % 2 > 0) && (primeNumber % 3 > 0) && (primeNumber % 4 > 0) && (primeNumber % 5 > 0) && (primeNumber % 6 > 0) && (primeNumber % 7 > 0) && (primeNumber % 8 > 0) && (primeNumber % 9 > 0) && (primeNumber % 10 > 0) && (primeNumber % 11 > 0)) {
			System.out.println("It is a prime number ");
			System.out.println("");
			System.out.println("Enter Any Positive Number Choice To Check If The Number Is A Prime Number ");
			primeNumber = input.nextInt();	

			} else {
                    	System.out.println("It is not a prime number ");
			System.out.println("Enter Any Positive Number Choice To Check If The Number Is A Prime Number ");
			primeNumber = input.nextInt();
               	        }
			
		   }
	

			if (primeNumber == 0){
			System.out.println(" Thanks For Checking We Hope To See Your Again");
			}
		}


	}
}