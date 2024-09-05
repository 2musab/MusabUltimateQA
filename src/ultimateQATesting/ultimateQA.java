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

public class ultimateQA extends Parameters {

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-1/");

	}

	@Test(priority = 1)
	public void first() {

		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		firstName.sendKeys(fName);

	}

	@Test(priority = 2)
	public void link2() {

		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-2/");

	}

	@Test(priority = 3)
	public void second() {

		first();

		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		lastName.sendKeys(surName);

	}

	@Test(priority = 4)
	public void link3() {

		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-3/");

	}

	@Test(priority = 5)
	public void third() {

		WebElement gender = driver.findElement(By.cssSelector("input[value='female']"));
		gender.click();
		gender.getAttribute("value");

		second();

	}

	@Test(priority = 6)
	public void link4() {
		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-4/");
	}

	@Test(priority = 7)
	public void emergencyInfo() {

		third();

		WebElement gender = driver.findElement(By.id("radio1-f"));
		gender.click();

		WebElement gender2 = driver.findElement(By.id("radio2-m"));
		gender2.click();

		WebElement maleFirstName = driver.findElement(By.id("f2"));
		maleFirstName.sendKeys(mName);
		WebElement lastName = driver.findElement(By.id("l2"));
		lastName.sendKeys(surName);

	}

	@Test(priority = 8)
	public void link5() {

		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-5/");
	}

	@Test(priority = 9)
	public void submit() {

		emergencyInfo();

		WebElement submit = driver.findElement(By.id("submit2"));
		submit.click();

	}

	@Test(priority = 10)
	public void animal() {

		WebElement submit = driver.findElement(By.cssSelector("form[action='https://ultimateqa.com']"));
		List<WebElement> radio = submit.findElements(By.tagName("input"));
		int radioSize = radio.size() - 1;
		int randomRadio = rand.nextInt(radioSize);
		System.out.println(radioSize);

		WebElement animal = radio.get(randomRadio);
		animal.click();
		
		WebElement finalClick = driver.findElement(By.cssSelector("input[value='Submit']"));
		finalClick.click();

	}

}