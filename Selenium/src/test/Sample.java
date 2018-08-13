package test;

import org.openqa.selenium.WebDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/userdocuments/documents/khaiyum.mohammad/Selenium/chromedriver_win32.zip.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://thomsonreuters.addisonlee.com/thor/open/login/pinLogin.html");

	}

}
