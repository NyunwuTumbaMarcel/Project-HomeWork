package testRun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {



	@BeforeTest
	public void startTest() {
		
		
		
		
	}

	@Parameters({"firstName","lastName"})
	@Test
	public void mainTest(String firstName , String lastName) {
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		
		
	}

	@AfterTest
	public void endTest() {
		
		
		
		
	}



}
