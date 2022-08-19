package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInConfirmation {
	WebDriver driver;

	//launching a chrome browser
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NJYOTI\\Desktop\\Jars\\chromedriver104\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void run() throws AWTException, InterruptedException {
		driver.manage().window().maximize();
		Robot rob=new Robot();
		rob.mouseMove(1050,330); //moving cursor to 'No Thanks' button on pop up [doing trial and error way]
		Thread.sleep(2000);
		rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);    // pressing 'No Thanks'
		rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);  // releasing 'No Thanks'
	}
}
