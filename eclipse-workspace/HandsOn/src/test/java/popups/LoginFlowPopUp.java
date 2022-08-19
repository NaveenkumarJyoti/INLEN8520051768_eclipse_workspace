package popups;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFlowPopUp {
	WebDriver driver;
	
	//Launching chrome browser
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NJYOTI\\Desktop\\Jars\\chromedriver104\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://twitter.com/i/flow/login");
	}
	
	//Handling login flow window/pop up
	@Test
	public void run() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		
//		Robot rob=new Robot();
//		rob.mouseMove(450, -100);
//		Thread.sleep(2000);
//		rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='r-18jsvk2 r-4qtqp9 r-yyyyoo r-z80fyv r-dnmrzs r-bnwqim r-1plcrui r-lrvibr r-19wmn03']")).click();
	}
	
}
