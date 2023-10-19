package week2.day1.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local Name Entered");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Site Name Entered");


		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("50000");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryDD = new Select(industry);
		industryDD.selectByIndex(3);
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipDD = new Select(ownership);
		ownershipDD.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sourceDD = new Select(source);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select marketingDD = new Select(marketing);
		marketingDD.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDD = new Select(state);
		stateDD.selectByValue("TX");
		
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
	}
	

}
