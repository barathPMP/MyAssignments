package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.service.DriverFinder;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("Barath");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		//THE BELOW LINE IS NOT WORKING PROPERLY, NEED ASSISTANCE
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("New Company");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		System.out.println(displayed);
		
		driver.close();
		
		
		
	}

}
