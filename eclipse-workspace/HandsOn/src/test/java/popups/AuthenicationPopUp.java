package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AuthenicationPopUp {

	WebDriver driver;

	//Launching browser
	@BeforeTest
	public void setup() throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\NJYOTI\\Desktop\\Jars\\edgedriver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
	}

	//Handling popups
	@Test
	public void run() throws InterruptedException {
		Thread.sleep(2000);
		
		//Handling basic authentication pop up
		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Permission pop up
		driver.navigate().to("https://www.redbus.in/");
		
	}
	
	//Closing browser
	@AfterTest
	public void teardown() 
	{
		//driver.close();
	}

}
