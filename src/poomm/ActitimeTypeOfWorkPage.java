package poomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTypeOfWorkPage 
{
	//declaration
	
		public WebDriver driver;
		@FindBy(xpath="(//input[@name='statusCriterionAsString'])[1]")
		private WebElement statuslink;
		@FindBy(xpath="//input[@name='name']")
		private WebElement nametextbutton;
		

		@FindBy(xpath="(//input[@name='billableCriterionAsString'])[1]")
		private WebElement catagorylink;
		

		@FindBy(xpath="//input[@value='Show Types of Work']")
		private WebElement showtypesofworklink;
		

		@FindBy(xpath="//span[.='Create Type of Work']")
		private WebElement createtypesofwork;
		@FindBy(xpath="(//div[@class='editButton'])[18]")
		private WebElement deletesettingsbutton;
		@FindBy(xpath="//a[.='Amit kumar Sahoo']/../..//a[contains(text(),'delete')]")
		private WebElement deletethename;
		
		
		
		//initialization(access the webdriver)
		
		public ActitimeTypeOfWorkPage(WebDriver driver)
		{this.driver=driver;
			PageFactory.initElements(driver, this);
		}

	//utilization(we create a method of each and every stages)
		public void namemethod()
		{
			nametextbutton.sendKeys("bapi");
		}
	public void statusMethod()
	{
		statuslink.click();
	}
	public void catagoryMethod()
	{
		catagorylink.click();
	}
	public void showTypeOfWorkMethod()
	{
		showtypesofworklink.click();
	}
	public void createTypeOfWork()
	{
		createtypesofwork.click();
	}
	public void deletesettingsMethod()
	{
		deletesettingsbutton.click();
	}
	public void DeltethenameMethod()
	{
		deletethename.click();
	}
	public void alertmethod()
	{
		driver.switchTo().alert().accept();
	}
	
}
