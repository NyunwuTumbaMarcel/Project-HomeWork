package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercury {

	WebDriver driver;
	
	public mercury(WebDriver x) {
		
		driver = x;
			
	}
	

	public WebElement firstName() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		
		return x;
	
	}

	public WebElement lastName() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		
		return x;

}


	public WebElement phone() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
		
		return x;

	}

	public WebElement email() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		
		return x;

	}

	public WebElement address() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		
		return x;

	}

	public WebElement city() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
		
		return x;

	}

	public WebElement state() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
		
		return x;

	}

	
	public WebElement postalCode() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
		
		return x;

	}

	
	public WebElement country() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		
		return x;

	}


	public WebElement userName() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		return x;

	}

	public WebElement passWord() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		
		return x;

	}

	public WebElement confirmPassWord() {
		
		WebElement x = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
		
		return x;

	}

	






}
