package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	
 WebDriver driver;
	
	
	@BeforeTest
	
	public void setBaseURL() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khaiyum.mohammad\\eclipse-workspace\\Selenium\\src\\test\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.addisonlee.com/");
		
	}
	
	    @Test
	 
	       public void testAddleeSignin() {
		driver.findElement(By.linkText("SIGN IN")).click();
		//driver.findElement(By.xpath("html/body/div[1]/header/section[1]/div[2]/div[1]/a/span[2]")).click();
		
	
	
	
		
		
		
	}
		
	


}