package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// set up the driver path and launch the chromeDriver
				ChromeDriver driver =new ChromeDriver();
				//EdgeDriver driver = new EdgeDriver();
				// maximize my window
				driver.manage().window().maximize();
				// Load the url
				driver.get("http://leaftaps.com/opentaps/control/login");

				// find the element and enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");

				// find the element and enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// find the element and click on login button
				driver.findElement(By.className("decorativeSubmit")).click();
				// verification
				// to get the title of the webpage
				String title = driver.getTitle();// ctrl+2
				System.out.println(title);
				// find the element then click on crmsfa
				// driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.partialLinkText("CRM")).click();
				// to get the title of the webpage
				String leadPage = driver.getTitle();// ctrl+2
				System.out.println(leadPage);
				//click on lead button
				driver.findElement(By.linkText("Leads")).click();
				//click on createLead button
				driver.findElement(By.linkText("Create Lead")).click();
				//Enter the company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				//Enter the firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
				//Enter the lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
				//click createlead button
				driver.findElement(By.name("submitButton")).click();
				//verification
				//to retrive the text from dom page
				String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
				
				System.out.println(firstName);
				
				if(firstName.contains("Princila")) {
					System.out.println("The Lead is created");
				}
				else {
					System.out.println("The Lead is not created");
				}
				//return type of findElement
				//WebElement findElement = driver.findElement(By.name("submitButton"));
				
				
				// Close the open browser
				// driver.close();

			}
		
		
	}
