import java.util.*;

	public class CodeToSortInDess{
		public static void main(String... args){
		
		int[] array = {81, 35, 67, 45, -1, 2, 0, 11, -5, -5};


		System.out.print(Arrays.toString(sortArray(array)));

		}


			public static int[] sortArray(int[] inputArray){

			int tempValue = 0;

				for(int check = 0; check < inputArray.length ; check++){
				   for(int collect = 0; collect < inputArray.length; collect++){
					if(inputArray[collect] < inputArray[check]){
						tempValue = inputArray[check];
						inputArray[check] = inputArray[collect];
						inputArray[collect]= tempValue;
					}
				   }
				}
						return number;
		

			}
	}


