package week1.day2;

import java.util.Arrays;

public class PrintDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		
		Arrays.sort(num);
		
		int len = num.length;
		
		//System.out.println(len);
		
		for (int i = 0; i < len-1; i++) {
			if(num[i] == num[i+1]) {
				System.out.println("Duplicate Value "+ num[i] + " ");
			}
		}
		
		
	}

}
