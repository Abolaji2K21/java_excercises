import java.util.Scanner;
	
	public class SubjectCombination {	
	
		public static void main(String[] args) {
	

	// CODE SHOWING SUBJECT COMBINATION AT SEMI COLON 
	
		Scanner input= new Scanner(System.in);
		
		System.out.println("What are the best subject combination?");


		String Userinput= input.nextLine();

	if (Userinput.equals("Maths,English,Physic,Chemistry")){
		
		System.out.println("Correct With Pleasure");

	  } else {
		System.out.println("incorrect With Disappointment");


	 }
	
	}







}