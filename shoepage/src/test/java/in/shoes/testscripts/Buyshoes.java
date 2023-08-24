package in.shoes.testscripts;

 
import org.testng.annotations.Test;

import in.shoes.pages.Addtocart;
import in.shoes.pages.Cart;
import in.shoes.pages.Home;
import in.shoes.pages.LandingPage;
import in.shoes.pages.Loginpage;
import in.shoes.pages.Placeorder;
 


public class Buyshoes extends BaseTest {
	@Test
	
	public void buyshoes() throws InterruptedException {
		
		LandingPage page=new LandingPage(driver);
		
		page.registerPage();
		
		page.EnterName();
		
		page.EnterEmail();
		
		page.EnterPassword();
		
		page.clickRegisterBtn();
		
		
		Loginpage page1= new Loginpage(driver);
		page1.EnterEmail();
		
		page1.EnterPassword();
		
		page1.clickLoginBtn();
		
		Addtocart addtocart=new Addtocart(driver);
		
		
		addtocart.clickaddtocart();
		
		Home home =new Home(driver);
		home.homebtn();
		
		Cart cart = new Cart(driver);
		cart.cartbtn();
		
		Placeorder placeorder = new Placeorder(driver);
		placeorder.clickplaceorderbtn();
		
//		String expected="Message:Order Placed Successfully with ID: 10";
//		String actual=title.verifyTitle();
//		
//		System.out.println(actual);
//		Assert.assertEquals(actual, expected);
//		
				
	}
		 
}
