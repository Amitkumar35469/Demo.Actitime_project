package poomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewTaskPage 
{
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewtask;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomer;
	
	public AddNewTaskPage  ( WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void addnewtaskmethod() throws InterruptedException
    {
    	addnewtask.click();
    	Thread.sleep(3000);
    }
	public void createnewcustomerMethod() throws InterruptedException
	{
		createnewcustomer.click();
		Thread.sleep(3000);
	}
}
