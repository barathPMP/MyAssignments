package week1.day2.assignments;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 34163, revnum = 0, a;
		
		a = num;
		
		for (; a!=0; a/=10) {
			int digit =a%10;
			revnum = revnum*10 + digit;
			
		}
		
		
		System.out.println("Given number is "+ num + " and the reversed number is " + revnum);
		
		if(num == revnum) {
			System.out.println("Palindrome");
		}
		
		else {
			System.out.println("Not a palindrome");
			
		}
		
		
		
	}

}
