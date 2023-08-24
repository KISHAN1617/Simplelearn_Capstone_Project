package in.shoes.testscripts;

 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//1.open the browser
		
				driver=new ChromeDriver();
				//2.maximize it
				driver.manage().window().maximize();
				
				//3. navigate to url
				driver.get("http://localhost:9010/");
		
	}
	

}
