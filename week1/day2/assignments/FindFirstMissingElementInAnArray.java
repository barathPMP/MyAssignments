package week1.day2.assignments;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		
		
		Arrays.sort(arr);
		
		for (int i = arr[0]; i <= arr.length - 1; i++) { 
			
			if(i != arr[i]) { 
				System.out.println(i);
				break;
			}
			
		}
		
	}

}


//NEED ASSISTANCE