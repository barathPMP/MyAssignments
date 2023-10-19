package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookInspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		//driver.findElement(By.ById("email")).sendKeys("");
		
		driver.findElement(By.id("email")).sendKeys("barathsrini@yahoo.com");
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.id("u_0_0_sF")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title is " + title);
		
		
	}

}
