package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Delete Lead:
		//1	Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//2	Enter the username
		//3	Enter the password				
		//4	Click Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//8	Click on Phone
		driver.findElement(By.xpath("(//span[@class=\"x-tab-strip-text \"])[2]")).click();
		
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9677081188");
		
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		
		//11	Capture lead ID of First Resulting lead
		String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The lead ID is " + leadId);
		
		///BELOW CLICK IS NOT WORKING NEED ASSISTANCE
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
		
		//13	Click Delete
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[4]")).click();
		
		
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys(leadId);
		
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		String verText = driver.findElement(By.xpath("//div[text()=\"No records to display\"]")).getText();
		
		if(verText == "No records to display") {
			System.out.println("Deletion is successful");
		}
		else
			System.out.println("Unsuccessful delete");
		//18	Close the browser (Do not log out)
		driver.close();
		
	}

}
