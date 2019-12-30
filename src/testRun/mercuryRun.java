package testRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectPages.mercury;

public class mercuryRun {

	WebDriver driver;
	
	mercury mc;

	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmarc\\Desktop\\Chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		mc = new mercury(driver);
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
	}


	@Test(priority = 1)
	public void test() {
		
		mc.firstName().sendKeys("Nyunwu");
	
		mc.lastName().sendKeys("Tumba");
	
		mc.phone().sendKeys("301-458-9649");
	
		mc.email().sendKeys("tmarcel25@yahoo.com");
	
		mc.address().sendKeys("2376 Vermont Avenue");
	
		mc.city().sendKeys("Hyattsville");
	
		mc.state().sendKeys("Maryland");
	
		mc.postalCode().sendKeys("20785");
	
		mc.country();
		Select sc = new Select(mc.country());
		sc.selectByIndex(3);
	
		mc.userName().sendKeys("Marcel");
	
		mc.passWord().sendKeys("Marcel1");
	
		mc.confirmPassWord().sendKeys("Marcel1");
	
	
	}

	@Test
	public void validateUrl() {
		
		String x = driver.getCurrentUrl();
		
		Assert.assertEquals(x, "http://newtours.demoaut.com/mercuryregister.php");
	}


	@Test(priority = 2)
	public void validateTitle() {
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Register: Mercury Tours");
		
		
	}

	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}


}
