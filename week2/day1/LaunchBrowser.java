package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Call the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("https://www.facebook.com/");
		
		//Close Browser
		driver.close();
		
	}

}
