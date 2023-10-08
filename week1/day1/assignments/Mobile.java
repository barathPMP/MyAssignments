package week1.day1.assignments;

public class Mobile {

	public void makeCall() {
		
		String mobileModel = "iPhone 15";
		float mobileWeight = 199.2f;
		
		System.out.println(mobileModel + " " + mobileWeight);
		
	}

	public void sendMsg() {
		
		boolean isFullCharged = true;
		int mobileCost = 89000;
		
		System.out.println(isFullCharged + " " + mobileCost);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob = new Mobile();

		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my Mobile");
		
		
	}

}
