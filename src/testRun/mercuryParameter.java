package testRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectPages.mercury;

public class mercuryParameter {


WebDriver driver;
	
	mercury mc;

	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmarc\\Desktop\\Chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		mc = new mercury(driver);
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
	}

	@Parameters ({"firstName","lastName","phone","email"})
	@Test(priority = 1)
	public void test(String firstName, String lastName, String phone, String email) {
		
		mc.firstName().sendKeys(firstName);
	
		mc.lastName().sendKeys(lastName);
	
		mc.phone().sendKeys(phone);
	
		mc.email().sendKeys(email);
	
		
	
	}

	@Parameters ({"expected"})
	@Test(priority = 2)
	public void validateUrl(String expected) {
		
		String x = driver.getCurrentUrl();
		
		Assert.assertEquals(x, expected);
	}

	@Parameters ({"expected1"})
	@Test(priority = 3)
	public void validateTitle(String expected1) {
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, expected1);
		
		
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}


}





















