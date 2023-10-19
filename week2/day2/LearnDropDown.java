package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		//Fill Mandatory Fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bank of America");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Barath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivas");
		
		//Source Dropdown
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select(source);
		sourceDD.selectByVisibleText("Employee");
		
		
		//Marketing Dropdown
		
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketDD = new Select(marketing);
		marketDD.selectByValue("9001");
		
		
		//Industry Dropdown
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industry);
		industryDD.selectByValue("IND_SOFTWARE");
		
		//Ownership Dropdown
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerDD = new Select(ownership);
		ownerDD.selectByIndex(6);
		
		//WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//Select ownershipDD = new Select(ownership);
		//ownershipDD.selectByValue("OWN_SCORP");
		
		
		//CountryDropDown
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDD = new Select(country);
		countryDD.selectByVisibleText("India");
		
		//Click Submit Button
		driver.findElement(By.name("submitButton")).click();
		
		//Validation
		String Fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String Company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if(Fname.contains("Barath")) {
			
			System.out.println("A new lead " + Fname + " has been created for " + Company);
			String title = driver.getTitle();
	        System.out.println(title);
			
		}
		
		else 
			System.out.println("No Lead created");
			
		
	}

}
