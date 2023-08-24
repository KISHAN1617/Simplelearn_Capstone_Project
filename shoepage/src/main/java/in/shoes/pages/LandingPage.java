package in.shoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(css="body > div:nth-child(2) > form > a")
	private WebElement register;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="email")
	private WebElement email;
	

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/form/a")
	private WebElement registerbtn;
	
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void registerPage()
	{
		register.click();
	}
	
	public void EnterName()
	{
		name.sendKeys("Rocky");
	}
	
	public void EnterEmail() {
	   email.sendKeys("rocky123@gmail.com");
	}
	
	public void EnterPassword()
	{
		password.sendKeys("Rocky");
	}
	
	public void clickRegisterBtn()
	{
		registerbtn.click();
	}
}
  
