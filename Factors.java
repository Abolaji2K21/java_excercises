import java.util.scanner;

		public class Factors{

		  public static void main(String[] args){

		    Scanner input = new Scanner(System.in);

		      int userinput= input.nextInt();
			
		       if (userinput > 0 ){
				
				System.out.print("Enter any value greater than zero");
			}

			 System.out.println("Factors of this numbers are");

		if (userinput < 1) {
		System.out.println("not a prime number");


			 for (a = 2; a < userinput; a++){

				if (userinput % a == 0){

					System.out.printf("not a prime num");
				
					else {
				System.out.println("prime num");
}

}
			}
			
			  
	}



}