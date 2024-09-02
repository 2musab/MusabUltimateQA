package ultimateQATesting;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ultimateQA {
	
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
	
	String[] firstNames = { "Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona", "George", "Hannah", "Ian",
	"Jasmine" };
	
	String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
	"Taylor" };
	
	int firstNamesLength = firstNames.length;
	int randomFirstName = rand.nextInt(firstNamesLength);
	
	int lastNamesLength = lastNames.length;
	int randomLastName = rand.nextInt(lastNamesLength);
	
	@BeforeTest
	public void mySetup() {
		
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/complicated-page");		
	}
	
	@Test
	public void firstCase() {
		
		WebElement nameInFirstCase = driver.findElement(By.id("et_pb_contact_name_0"));
		nameInFirstCase.sendKeys(firstNames[randomFirstName] + " " + lastNames[randomLastName]) ;
		
		WebElement emailInFirstCase = driver.findElement(By.id("et_pb_contact_email_0"));
		emailInFirstCase.sendKeys(firstNames[randomFirstName] + lastNames[randomLastName] + "@gmail.com");
		
		WebElement message = driver.findElement(By.id("et_pb_contact_message_0"));
		message.sendKeys("Hi, this is an automated message");
		
		WebElement resultInput = driver.findElement(By.name("et_pb_contact_captcha_0"));
		resultInput.sendKeys("10");
		
		WebElement button = driver.findElement(By.cssSelector("div[id='et_pb_contact_form_0'] button[name='et_builder_submit_button']"));
		button.click();
		
		WebElement username = driver.findElement(By.id("user_login_66d5b84159d2a"));
		WebElement password = driver.findElement(By.id("user_pass_66d5b84159d2a"));
		
		username.sendKeys("I851"+firstNames[randomFirstName]);
		password.sendKeys("45kjh_o@");
		
		WebElement login = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > article:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > form:nth-child(1) > p:nth-child(4) > button:nth-child(1)"));
		login.click();
	
	}

}
