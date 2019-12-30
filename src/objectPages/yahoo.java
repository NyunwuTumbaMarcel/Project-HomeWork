package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahoo {


	WebDriver driver;

	public yahoo(WebDriver x) {
		
		driver = x;
	}

	public WebElement firstName() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
	
		return x;
	}


	public WebElement lastName() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]"));
	
		return x;
	}



	public WebElement emailAddress() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
	
		return x;
	}


	public WebElement currentEmailLink() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-altreg\"]"));
	
		return x;
	}


	public WebElement passWord() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
	
		return x;
	}


	public WebElement countryCode() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"relative-country-code\"]"));
	
		return x;
	}

	
	public WebElement mobileNumber() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
	
		return x;
	}

	public WebElement birthMonth() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
	
		return x;
	}


	public WebElement day() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]"));
	
		return x;
	}

	public WebElement year() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]"));
	
		return x;
	}

	public WebElement terms() {
		
		WebElement x = driver.findElement(By.linkText("Terms"));
	
		return x;
	}

	public WebElement policy() {
		
		WebElement x = driver.findElement(By.linkText("Privacy Policy"));
	
		return x;
	}


	public WebElement cont() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]"));
	
		return x;
	}

	public WebElement signIn() {
		
		WebElement x = driver.findElement(By.linkText("Sign in"));
	
		return x;
	}



}
