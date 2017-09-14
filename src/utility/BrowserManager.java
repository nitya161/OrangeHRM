package utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BrowserManager {
	public static WebDriver browser;
	
	BrowserManager()
	{
		
	}
	
	public static WebDriver getdriver()
	{
		if(browser == null)
		{
			
		System.setProperty ("webdriver.chrome.driver","src\\driver\\chromedriver.exe");
		browser = new ChromeDriver();
		// implicitly waiting
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Maximize the browser
		browser.manage().window().maximize();
		
		// delete cookies
		browser.manage().deleteAllCookies();
		
		}
				
		return browser;
	}
	
	 public static void tearDown()
	 {
		 browser.quit();
	 }
}
