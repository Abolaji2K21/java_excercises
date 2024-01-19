import java.util.*;


	public class CodeToSortInAss{
		public static void main(String... args){
		
		int[] array = {98, 56, 67, 45};


System.out.print(Array.toString(sortArray(array)));

}


public static int[] sortArray(int[] inputArray){

	int temp = 0;

	for(int check = 0; check < inputArray.length ; check++){
		for(int collect = 0; collect < number.length; collect++){
			if(inputArray[collect] < inputArray[check]){
				temp = inputArray[check];
				inputArray[check] = inputArray[collect];
				inputArray[collect]= temp
			}
		}
	}
return number
		

}
}


