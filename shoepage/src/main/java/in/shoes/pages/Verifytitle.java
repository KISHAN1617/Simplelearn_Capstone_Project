package in.shoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifytitle {
	@FindBy(css="body > div:nth-child(3) > div > p")
	private WebElement verify;

	public Verifytitle(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public String verifyTitle()
	{
		return verify.getText();
	}
}
