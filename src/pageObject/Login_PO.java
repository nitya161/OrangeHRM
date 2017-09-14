package pageObject;
import repository.Login_repo;
import utility.BrowserManager;

public class Login_PO {

	public static void test_login()
	{
		System.out.println("navigated to login_PO");
		BrowserManager.getdriver().findElement(Login_repo.login_Field).click();
	  	System.out.println("clicked on login field");
		BrowserManager.getdriver().findElement(Login_repo.login_Field).sendKeys("_ohrmSysAdmin_");
		BrowserManager.getdriver().findElement(Login_repo.pwd_Field).click();
		BrowserManager.getdriver().findElement(Login_repo.pwd_Field).sendKeys("rXD15BDa");
		BrowserManager.getdriver().findElement(Login_repo.login_btn).click();
		System.out.println("login test successfully completed");
		
	}
}
