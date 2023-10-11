package week1.day2.assignments;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -200;
		
		if (number<0) {
			int posnum = Math.abs(number); //another way is int posnum = -number;
			System.out.println("The number " + number + " is converted to " + posnum);
		}
		
		else {
			System.out.println("The number is already positive");
		}
		
	}

}
