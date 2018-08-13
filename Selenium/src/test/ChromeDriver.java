package test;

import org.openqa.selenium.WebDriver;

public class ChromeDriver {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/userdocuments/documents/khaiyum.mohammad/Selenium/chromedriver_win32.zip.exe");

	                  driver = new ChromeDriver();
		
		driver.get("");
	}

}
