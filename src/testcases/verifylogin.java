package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.loginpage;

public class verifylogin {

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "E:/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		loginpage login=new loginpage(driver);
		login.clickloginlink();
		login.typeusername();
		login.typepassword();
		login.clickloginbutton();
		
		
	}

}
