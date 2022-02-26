package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		System.out.println("Automation testing Started");
		WebDriverManager.chromedriver().setup();

		System.out.println("Opening Chrome Browser");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement findElementUsername = driver.findElement(By.id("username"));
		findElementUsername.sendKeys("Demosalesmanager");

		WebElement findElementPassword = driver.findElement(By.id("password"));
		findElementPassword.sendKeys("crmsfa");

		WebElement findElementLogin = driver.findElement(By.className("decorativeSubmit"));
		findElementLogin.click();

		WebElement findElementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		findElementCRMSFA.click();

		WebElement findElementLeads = driver.findElement(By.linkText("Leads"));
		findElementLeads.click();

		WebElement findElementCreateLead = driver.findElement(By.linkText("Create Lead"));
		findElementCreateLead.click();

		WebElement findElementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		findElementCompanyName.sendKeys("Mohamed Internationals");

		WebElement findElementForename = driver.findElement(By.id("createLeadForm_firstName"));
		findElementForename.sendKeys("Mohamed");

		WebElement findElementSurname = driver.findElement(By.id("createLeadForm_lastName"));
		findElementSurname.sendKeys("Arief Khan");

		WebElement findElementFirstName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		findElementFirstName.sendKeys("Arieee");

		WebElement findElementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		findElementDepartment.sendKeys("Computer Science");

		WebElement findElementDescription = driver.findElement(By.id("createLeadForm_description"));
		findElementDescription.sendKeys("Description Notes");

		WebElement findElementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		findElementEmail.sendKeys("mohamedarief.m@gmail.com");

		WebElement findElementDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(findElementDD);
		dd.selectByVisibleText("Armed Forces Americas");

		WebElement ElementCreateLead = driver.findElement(By.className("smallSubmit"));
		ElementCreateLead.click();

		System.out.println("The Title of the Resulting page is:" + driver.getTitle());

		driver.findElement(By.linkText("Duplicate Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mohamed Internationals new");

		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SharinAshiya");
		driver.findElement(By.name("submitButton")).click();

		System.out.println("The Title of the Resulting page is:" + driver.getTitle());
	}

}
