package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
By logintab=By.xpath("//*[@id=\"pt-login\"]/a");
By username=By.xpath("//*[@id=\"wpName1\"]");
By password=By.xpath("//*[@id=\"wpPassword1\"]");
By login=By.xpath("//*[@id=\"wpLoginAttempt\"]");
public WebDriver driver;
public loginpage(WebDriver driver) {
	
	this.driver=driver;
	
}
public void clickloginlink() {
	driver.findElement(logintab).click();
}
public void typeusername() {
	driver.findElement(username).sendKeys("Aki910041");
}
public void typepassword() {
	driver.findElement(password).sendKeys("Anki@123");

}
public void clickloginbutton() {
	driver.findElement(login).click();
	
}
}
