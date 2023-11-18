import java.util.Scanner;

	
	public class Game {

		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
				
		System.out.println( "ENTER YOUR NAME PLAYER 1!!! " );
			String player1 = input.nextLine();

		System.out.println( "ENTER YOUR NAME PLAYER 2!!! " );
			String player2 = input.nextLine();

		System.out.println( "ENTER A NUMBER RANGING FROM 0-2 PLAYER 1!!! " );
			int choice1 = input.nextInt();

		System.out.println( "ENTER A NUMBER RANGING FROM 0-2 PLAYER 2!!! " );
			int choice2 = input.nextInt();


		if ( choice1 > choice2 )
		System.out.println( player1 + " WON " + player2);

		if ( choice1 < choice2 )
		System.out.println( player2 + " WON " + player1);

		if ( choice1 == choice2 )
		System.out.println( " DRAW CAN BOTH PLAYER PLS CHOOSE A NEW NUMBER " );


		




	}

}