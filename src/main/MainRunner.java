package main;
import utility.BrowserManager;
import pageObject.Login_PO;

public class MainRunner {

	public static void main(String args[]) 
	{
		BrowserManager.getdriver().get("https://julybatch-trials63.orangehrmlive.com/");
		//BrowserManager.tearDown();
		//BrowserManager.getdriver().wait(3000);
	
		//Login_PO login = new Login_PO();
		//System.out.println("Page object instantiated");
		//login.test_login();
		Login_PO.test_login();
		System.out.println("test login method called");
		//BrowserManager.getdriver().wait(3000);
		
	}

}
