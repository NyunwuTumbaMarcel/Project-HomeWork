package testRun;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectPages.yahoo;

public class yahooRun {

	WebDriver driver;
	
	yahoo yh;


	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmarc\\Desktop\\Chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		yh = new yahoo(driver);
	
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
	
	}

	@Test
	public void validateFirstName() {
		
		Boolean x = yh.firstName().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	@Test
	public void validateLastName() {
		
		Boolean x = yh.lastName().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	@Test
	public void validateEmailAddress() {
		
		Boolean x = yh.emailAddress().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	@Test
	public void validateCurrentEmailLink() {
		
		Boolean x = yh.currentEmailLink().isEnabled();
		
		Assert.assertTrue(x);
	
	}

	
	@Test
	public void validatePassWord() {
		
		Boolean x = yh.passWord().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	@Test
	public void validateCountryCode() {
		
		Boolean x = yh.countryCode().isDisplayed();
		
		Assert.assertTrue(x);
	
	}


	@Test
	public void validateMobileNumber() {
		
		Boolean x = yh.mobileNumber().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	@Test
	public void validateBirthMonth() {
		
		Boolean x = yh.birthMonth().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	
	@Test
	public void validateDay() {
		
		Boolean x = yh.day().isDisplayed();
		
		Assert.assertTrue(x);
	
	}

	@Test
	public void validateYear() {
		
		Boolean x = yh.year().isDisplayed();
		
		Assert.assertTrue(x);
	
	}
	
	
	@Test
	public void validateTerms() {
		
		Boolean x = yh.terms().isEnabled();
		
		Assert.assertTrue(x);
	
	}
	
	@Test
	public void validatePrivacyPolicy() {
		
		Boolean x = yh.policy().isEnabled();
		
		Assert.assertTrue(x);
	
	}
	
	@Test
	public void validateCont() {
		
		Boolean x = yh.cont().isDisplayed();
		
		Assert.assertTrue(x);
	
	}
	
	@Test
	public void validateSignInLink() {
		
		Boolean x = yh.signIn().isEnabled();
		
		Assert.assertTrue(x);
	
	}
	

	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}


}
