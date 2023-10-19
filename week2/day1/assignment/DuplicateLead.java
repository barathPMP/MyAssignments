package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the URL
		
		//driver.get("www.google.com");
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		
		//Enter Login details and signin
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		  //7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BCS");

		
		  //8. Enter FirstName Field Using id Locator
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Barath");
		
		  //9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srini");
		
		  //10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("TSB");
		
		  //11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("RPA");
		
	
		
		  //12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This describes RPA");
		
		
		  //13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("barathsrinivasan92@gmail.com");
		
		  //14. Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		
        //15. Get the Title of Resulting Page using driver.getTitle()
		System.out.println(driver.getTitle());
		
        //16. Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
        //17. Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Company BCS");
		
		
        //18.Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("New Barath");
		
		
		//  19.Click on Create Lead Button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
        //20. Get the Title of Resulting Page using driver.getTitle()

		System.out.println(driver.getTitle());
		
		
		
	}

}
