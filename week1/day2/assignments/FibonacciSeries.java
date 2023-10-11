package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 8, firstNum = 0, secNum = 1;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i = 1; i < range; i++) {
			
			int sum = firstNum + secNum; //sum = 1; 2, 3, 5, 8...
			
			firstNum = secNum; //firstNum = 1; 1, 2, 3,...
			
			secNum = sum; //secNum = 1; 2, 3, 5,...
			
			System.out.println(sum);
			
		}
		
	}

}
