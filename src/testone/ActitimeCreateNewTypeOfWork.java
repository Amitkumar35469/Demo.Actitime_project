package testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poomm.ActitimeHomePage;
import poomm.ActitimeLoginPage;
import poomm.ActitimeSettingPage;
import poomm.ActitimeTypeOfWorkPage;
import poomm.CreateNewTypeOfWorkPage;

public class ActitimeCreateNewTypeOfWork {

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
		typeofwork.createTypeOfWork();
		
		
		CreateNewTypeOfWorkPage nameentry = new CreateNewTypeOfWorkPage(driver);
		nameentry.nameMethod();
	    nameentry.createtypeofworkmethod();
	    
	    homepageopen.logoutMethod();
	    driver.quit();


	}

}
