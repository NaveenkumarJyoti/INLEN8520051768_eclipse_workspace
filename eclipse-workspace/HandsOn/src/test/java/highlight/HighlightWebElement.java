package highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HighlightWebElement {
	WebDriver driver;

	//Launching chrome browser
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\NJYOTI\\Desktop\\Jars\\edgedriver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.navigate().to("https://facebook.com/login");
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);

		//highlighting email input box
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').style.background='yellow';");
		Thread.sleep(1500);

		//highlighting password input text
		WebElement pwd=driver.findElement(By.id("pass"));
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].style.border='2px solid red';", pwd);
		Thread.sleep(2000);
	}

	//Closing the browser
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
