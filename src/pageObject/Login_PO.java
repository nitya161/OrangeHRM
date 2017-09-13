package pageObject;
import org.openqa.selenium.By;
import utility.BrowserManager;

public class Login_PO {

	public static void test_login()
	{
		System.out.println("navigated to login_PO");
		BrowserManager.browser.findElement(By.id("login_Field")).click();
	  	//BrowserManager.getdriver().findElement(By.id("txtUsername")).click();
		BrowserManager.getdriver().findElement(By.id("login_Field")).sendKeys("ohrmSysAdmin");
		BrowserManager.getdriver().findElement(By.id("pwd_Field")).click();
		BrowserManager.getdriver().findElement(By.id("pwd_Field")).sendKeys("rXD15BDa");
		BrowserManager.tearDown();
	}
}
