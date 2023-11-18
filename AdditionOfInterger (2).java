

import java.util.Scanner;
	
	public class AdditionOfInterger{
           public static void main(String[] args){
                Scanner sir = new Scanner(System.in);

	System.out.println( "ENTER DIGITS OF YOUR CHOICE " );
	
	int userInput = sir.nextInt();
	
	int firstDigit = userInput/1000;
         int remainder = userInput%1000;
           int secondDigit = remainder/100;
             int remainder1 = remainder%100;
              int thirdDigit = remainder1/10;
                int forthDigit= remainder%10;

      if (userInput>=10000)
          System.out.print("INVALID NUMBER!!!");

    else if(userInput==1000)
       System.out.printf("the sum of the integer is %d%n",(firstDigit+secondDigit+thirdDigit+forthDigit));
                
     else if(userInput>=100)
       System.out.printf("the sum of the integer is %d%n",(secondDigit+thirdDigit+forthDigit));
                
     else if(userInput>=10)
       System.out.printf("the sum of the integer is %d%n",(thirdDigit+forthDigit));
                
     else if(userInput<10)
       System.out.printf("the sum of the integer is %d%n",(forthDigit));
                
  
              
      





}



}