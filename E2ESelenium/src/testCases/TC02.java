package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02 {
	@Test
	public void tC1() {
		System.setProperty("webdriver.chrome.driver", "/Users/dharam/MyWork/E2ESelenium/Driver/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("howdy");
		driver.close();
		driver.quit();
	}
}
