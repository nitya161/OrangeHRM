package main;
import utility.BrowserManager;
import pageObject.Login_PO;

public class MainRunner {

	public static void main(String args[]) 
	{
		BrowserManager.getdriver().get("https://julybatch-trials63.orangehrmlive.com/");
		System.out.println("test login method called");
		Login_PO.test_login();
		
	}

}
