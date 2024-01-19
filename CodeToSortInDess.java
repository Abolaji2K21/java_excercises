import java.util.*;


	public class CodeToSortInAss{
		public static void main(String... args){
		
		int[] array = {81, 35, 67, 45, -1, 0, 2, -2};


System.out.print(Arrays.toString(sortArray(array)));

}


public static int[] sortArray(int[] beejay){

	int  temp= 0;

	for(int check = number.length - 1 ; check >= 0 ;  check--){
		for(int collect = number.length - 1; collect >= 0; collect--){
			if(beejay[collect] < beejay[check]){
				temp = number[check];
				beejay[check] = beejay[collect];
				beejay[collect]= temp;
			}
		}
	}
return beejay;
		

}
}


