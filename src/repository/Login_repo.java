package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserManager;

public class Login_repo 
{
	public WebElement login_Field = BrowserManager.browser.findElement(By.id("txtUsername"));
	//By pwd_Field = By.id("txtPassword");
	WebElement pwd_Field = BrowserManager.browser.findElement(By.id("txtPassword"));

}
