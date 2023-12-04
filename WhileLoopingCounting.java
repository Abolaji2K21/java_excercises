import java.util.Scanner; 

	public class WhileLoopingCounting{
	public static void main(String... args){

	int positiveNumber = 0;
	int negativeNumber = 0;
	int zeroNumber     = 0;
	
	Scanner input = new Scanner(System.in);



	System.out.print(" Enter Any Numbers Of Your Choice : ");
		while (input.hasNextInt()) {
		int userInput = input.nextInt();
	
		if ( userInput > 0 ){
			positiveNumber = positiveNumber + 1;
		}
		if ( userInput < 0 ){
			negativeNumber = negativeNumber + 1;
		}
		if ( userInput == 0){
			zeroNumber     = zeroNumber + 1;
		}
	System.out.print(" Enter Any Numbers Of Your Choice : ");
	       }


	
		System.out.println("Total Number Of Positive Numbers Entered " + positiveNumber);
		System.out.println("Total Number Of Negative Numbers Entered " + negativeNumber);
		System.out.println("Total Number Of Zero Numbers Entered " + zeroNumber);
	

	
	

	























	}
}