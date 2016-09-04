package simpleTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert; 

public class firstTest {

	@Test
	public void startWebDriver()
	{
		System.setProperty("webdriver.gecko.driver","gecko/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.s3group.com/");
		Assert.assertTrue("Is title correct", 
							driver.getTitle().startsWith("Connected Consumer"));
		driver.quit();
	}
} 
