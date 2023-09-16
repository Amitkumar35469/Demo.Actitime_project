package testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poomm.ActitimeCreateNewLeaveType;
import poomm.ActitimeHomePage;
import poomm.ActitimeLeaveTypePage;
import poomm.ActitimeLoginPage;
import poomm.ActitimeSettingPage;

public class ActitimeLeaveTypeAndLogout {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();

		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();
		
		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.settingmethod();
		Thread.sleep(4000);
		
		
		ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
		settingpage.leavetype();
		
		ActitimeLeaveTypePage leavetype = new ActitimeLeaveTypePage(driver);
		leavetype.createleavetypeMethod();
		
		ActitimeCreateNewLeaveType newleavetype = new ActitimeCreateNewLeaveType(driver);
		newleavetype.createnewleavetypeMethod();
		newleavetype.secondcreateleavemethod();
		
		homepageopen.logoutMethod();
		driver.quit();
		
		

	}

}
