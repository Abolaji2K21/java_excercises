import java.util.Scanner;

	public class ListOfMenu{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	System.out.println("List Of Menu Functions ");
	System.out.print("Hello User Pls Enter Any Number Ranging From 1 To 8 So As To Help You Navigate Through You Menu : ");

	    int userInput = input.nextInt();
	if (( userInput < 1 ) || (userInput > 8)){
	    System.out.print("You Have Entered An Invalid Number :");
	}
		if (userInput == 1){
		System.out.println(" Phone Book ");
		System.out.println("Enter 1  For Search ");
		System.out.println("Enter 2  For Service Nos. ");
		System.out.println("Enter 3  For Add Name ");
		System.out.println("Enter 4  For Erase ");
		System.out.println("Enter 5  For Edit ");
		System.out.println("Enter 6  For Assign Tone ");
		System.out.println("Enter 7  For Send B'Card ");
		System.out.println("Enter 8  For Option ");
		System.out.println("Enter 9 For Speed Dials ");
		System.out.println("Enter 10  For Voice Tags ");

System.out.print("Hello User Pls Enter Any Number Ranging From 1 To 10 So As To Help You Navigate Through The PhoneBook Option : ");			
			userInput = input.nextInt();
	if (( userInput < 1 ) || (userInput > 10)){
	    System.out.print("You Have Entered An Invalid Number :");
	}
			if (userInput == 1 ){ 
		      System.out.println(" Search ");
			}
			if (userInput == 2 ){ 
		      System.out.println(" Service Nos. ");
			}
			if (userInput == 3 ){ 
		      System.out.println(" Add Name ");
			}
			if (userInput == 4 ){ 
		      System.out.println(" Erase ");
			}
			if (userInput == 5 ){ 
		      System.out.println(" Edit ");
			}
			if (userInput == 6 ){ 
		      System.out.println(" Assign Tone  ");
			}
			if (userInput == 7 ){ 
		      System.out.println(" Send B'Card  ");
			}
			if (userInput == 8 ){ 
		      System.out.println("Enter 1 or 2 ");
				userInput = input.nextInt();
				   
				  if (userInput == 1){
		      System.out.println(" Type Of View ");
				} 
				 if (userInput == 2){
		      System.out.println(" Memory Status ");
				}
			}
			if (userInput == 9 ){ 
		      System.out.println(" Speed Dials ");
			}
			if (userInput == 10 ){ 
		      System.out.println(" Voice Tags ");
			}
	

	}
				if (userInput == 2){
		System.out.println(" Messages");
		System.out.println("Enter 1  For Write Messages ");
		System.out.println("Enter 2  For Inbox ");
		System.out.println("Enter 3  For Outbox ");
		System.out.println("Enter 4  For Picture Messages ");
		System.out.println("Enter 5  For Templates ");
		System.out.println("Enter 6  For Smileys ");
		System.out.println("Enter 7  For Message Settings ");
		System.out.println("Enter 8  For Info Service ");
		System.out.println("Enter 9  For Voice MailBox Number ");
		System.out.println("Enter 10  For Service Command Editor ");

	System.out.print("Hello User Pls Enter Any Number Ranging From 1 To 10 So As To Help You Navigate Through The Messages Option : ");			
			userInput = input.nextInt();
	if (( userInput < 1 ) || (userInput > 10)){
	    System.out.print("You Have Entered An Invalid Number :");
	}

			if (userInput == 1 ){ 
		      System.out.println(" Write Message ");
			}
			if (userInput == 2 ){ 
		      System.out.println(" Inbox ");
			}
			if (userInput == 3 ){ 
		      System.out.println(" Outbox ");
			}
			if (userInput == 4 ){ 
		      System.out.println(" Picture Messages");
			}
			if (userInput == 5 ){ 
		      System.out.println(" Templates ");
			}
			if (userInput == 6 ){ 
		      System.out.println(" Smileys ");
			}
			if (userInput == 8 ){ 
		      System.out.println(" Info Service ");
			}
			if (userInput == 7 ){ 
		      System.out.println(" Message Settings ");
		      System.out.println("Enter Option 1 or 2");
				userInput = input.nextInt();
				   
				  if (userInput == 1){
		      System.out.println(" Set ");
		      System.out.println("Enter Option 1, 2 or 3");
				userInput = input.nextInt();
					if (userInput ==1 ){
		      			System.out.println(" Message Center Number ");
					}
					if (userInput ==2 ){
		      			System.out.println(" Messages Sent As ");
					}
					if (userInput ==3 ){
		      			System.out.println(" Message Validity ");
					}

				} 
				 if (userInput == 2){
		      System.out.println(" Common ");
		      System.out.println("Enter Option 1, 2 or 3");
				userInput = input.nextInt();
					if (userInput ==1 ){
		      			System.out.println(" Delivery Reports ");
					}
					if (userInput ==2 ){
		      			System.out.println(" Reply via Same Centre ");
					}
					if (userInput ==3 ){
		      			System.out.println(" Character Support ");
					}
				}
			}
			if (userInput == 9 ){ 
		      System.out.println(" Voice Mailbox Number ");
			}
			if (userInput == 10 ){ 
		      System.out.println(" Service Command Editor ");
			}
	   }

				if (userInput == 3){
	        	   System.out.println(" Chat ");
	  }


			 if (userInput == 4) {
            System.out.println("Call Register ");
            System.out.println("Enter 1 For Missed Calls ");
            System.out.println("Enter 2 For Received Calls ");
            System.out.println("Enter 3 For Dialled Numbers ");
            System.out.println("Enter 4 For Erase Recent Calls List ");

            System.out.print("Hello User, Please Enter Any Number Ranging From 1 To 5 To See All Activities Under Call Duration : ");
			userInput = input.nextInt();
            		System.out.println("Call Register ");
			System.out.println("Enter 1 , 2 , 3 or 4  : ");

				if ( userInput == 1){
            		System.out.println(" Missed Calls ");
			}
				if ( userInput == 2){
            		System.out.println(" Received Calls ");
			}
				if ( userInput == 3){
            		System.out.println(" Dialled Numbers ");
			}
				if ( userInput == 4){
            		System.out.println(" Erase Recent Calls List ");
			}
			
	  }
			

			if (userInput == 5) {
            System.out.println(" Show Call Duration  ");
            System.out.println("Enter 1 For Last Call Duration ");
            System.out.println("Enter 2 For All Call's Duration ");
            System.out.println("Enter 3 For Received call's Duration ");
            System.out.println("Enter 4 For Dialled Calls List ");
            System.out.println("Enter 5 For Clear Timers ");

System.out.print("Hello User, Please Enter Any Number Ranging From 1 To 5 To See All Activities Under Call Duration : ");
			userInput = input.nextInt();
            		System.out.println(" Show Call Costs  ");
			System.out.println("Enter 1 , 2 , 3 , 4 or 5 : ");

				if ( userInput == 1){
            		System.out.println(" Last Call Duration  ");
			}
				if ( userInput == 2){
           		 System.out.println(" All Call's Duration");
			}
				if ( userInput == 3){
           		 System.out.println(" Received call's Duration ");
			}
				if ( userInput == 4){
           		 System.out.println(" Dialled Calls List ");
			}
				if ( userInput == 5){
            		System.out.println(" Clear Timers ");
			}


	}

			if (userInput == 6) {
            System.out.println(" Show Call Costs  ");
            System.out.println("Enter 1 For Last Call Costs ");
            System.out.println("Enter 2 For All Call's costs ");
            System.out.println("Enter 3 For Clear Counters ");

System.out.print("Hello User, Please Enter Any Number Ranging From 1 To 5 To See All Activities Under Call Costs : ");
			userInput = input.nextInt();
            		System.out.println(" Show Call Costs  ");
			System.out.println("Enter 1 , 2 or 3: ");

				if ( userInput == 1){
            		System.out.println(" Last Call costs ");
			}
				if ( userInput == 2){
           		 System.out.println(" All Call's costs ");
			}
				if ( userInput == 3){
            		System.out.println(" Clear Counters ");
			}


	}


			if (userInput == 7) {
            System.out.println(" Call Cost Settings  ");
            System.out.println("Enter 1 For Call Costs Limit ");
            System.out.println("Enter 2 For Show costs in ");

System.out.print("Hello User, Please Enter Any Number Ranging From 1 To 5 To See All Activities Under Call Cost Settings : ");
			userInput = input.nextInt();
            		System.out.println(" Show Call Costs  ");
			System.out.println("Enter 1 or 2 : ");

				if ( userInput == 1){
            		System.out.println(" Call Costs Limit");
			}
				if ( userInput == 2){
           		 System.out.println(" Show costs in ");
			}
				
	}
	


				if (userInput == 8) {
           		 System.out.println(" Prepaid Credit ");

			}














	}
}