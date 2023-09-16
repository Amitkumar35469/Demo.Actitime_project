package testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poomm.ActitimeHomePage;
import poomm.ActitimeLoginPage;
import poomm.ActitimeSettingPage;
import poomm.ActitimeTypeOfWorkPage;

public class ActitimeDeleteTypeOfWork {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();

		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();
		
		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.settingmethod();
		driver.quit();
		
		ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
		settingpage.typesofwork();
		
		ActitimeTypeOfWorkPage typeofwork= new ActitimeTypeOfWorkPage(driver);
	    typeofwork.DeltethenameMethod();
	    typeofwork.alertmethod();
	    
	    
	    homepageopen.logoutMethod();
	    driver.quit();
		

	}

}
