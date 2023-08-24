package in.shoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	 
	@FindBy(name="email")
	private WebElement email;
	

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(css="body > div:nth-child(2) > form > button")
	private WebElement loginbtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	 
	public void EnterEmail() {
		
	   email.sendKeys("rocky123@gmail.com");
	}
	
	public void EnterPassword()
	{
		password.sendKeys("Rocky");
	}
	
	public void clickLoginBtn()
	{
		loginbtn.click();
	}
}