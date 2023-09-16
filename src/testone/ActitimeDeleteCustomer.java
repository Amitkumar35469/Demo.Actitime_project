package testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poomm.ActitimeHomePage;
import poomm.ActitimeLoginPage;
import poomm.AddNewTaskPage;
import poomm.CreateNewCustomer;
import poomm.DeleteSettingsPage;

public class ActitimeDeleteCustomer {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();

		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();

		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.tasksmethod();
		Thread.sleep(4000);

		AddNewTaskPage opentaskpage = new AddNewTaskPage(driver);
		opentaskpage.addnewtaskmethod();
		opentaskpage.createnewcustomerMethod();

		CreateNewCustomer addnewcustomer = new CreateNewCustomer(driver);
		addnewcustomer.customertextfieldMethod();
		addnewcustomer.customerdescriptiontextfieldMethod();
		addnewcustomer.createcustomerMethod();
		addnewcustomer.settingsMethod();

		DeleteSettingsPage deletename = new DeleteSettingsPage(driver);
		deletename.settingActionMethod();
		deletename.deleteMethod();
		deletename.deletepermanentelyMethod();
		
		homepageopen.logoutMethod();
		driver.close();

	}

}
