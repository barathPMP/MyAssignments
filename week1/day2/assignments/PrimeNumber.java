package week1.day2.assignments;


public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 175;
		boolean flag = false;
		
		
		for (int i = 2; i <= input/2; i++) { //i is 2; i<=8, i++
			
				if(input % i == 0) { 
					flag = true;
					break;
				}
			
			
			}
		
		if (!flag) {
			System.out.println(input + " is a prime number");
					
		}
		
		else {
			System.out.println(input + " is not a prime number");
		}
		
	}

}
