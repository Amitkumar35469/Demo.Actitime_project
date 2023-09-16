package testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poomm.ActitimeHomePage;
import poomm.ActitimeLoginPage;

public class ActitimeLoginLogout 
{

	public static void main(String[] args) throws Throwable 
	{
	
		 ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		 loginpage.loginmethod();
		 
		 ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		 homepageopen.logoutMethod();
		 
	

	}

}
