import java.util.Scanner;
	
	public class AreaTri{

		public static void main(String[] args){

		  Scanner input= new Scanner(System.in);
	
		     System.out.println(" Prompt users for A1");

		       double D=input.nextDouble();
		
		     System.out.println( " prompt user for B1");

			double E=input.nextDouble();

		      System.out.println( " prompt user for A2");

			double F=input.nextDouble();

		      System.out.println( " prompt user for B2");

			double G=input.nextDouble();

		      System.out.println( " prompt user for A3");

	                 double H=input.nextDouble();

		      System.out.println( " prompt user for B3");

	                 double I=input.nextDouble();

		    	double J= D*G+F*I+H*E-D*I- F*E-H*G;
			
			double K= J*(-1);
			
		      System.out.println(K);

			double area= K * 0.5;
		      
		      System.out.println("THE AREA OF A 3 POINT TRIANGLE IS = " + area);
	
		
	                



	
	
	
	
	}


}