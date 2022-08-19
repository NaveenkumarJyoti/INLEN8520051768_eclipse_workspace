package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HiddenDropDownValues {
	WebDriver driver;

	//Launching chrome browser
	@BeforeTest
	public void setUp() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NJYOTI\\Desktop\\Jars\\chromedriver104\\chromedriver.exe");
		driver=new ChromeDriver(opt);
		driver.navigate().to("https://www.flipkart.com");
	}

	@Test
	public void run() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		Thread.sleep(1000);
		
		List<WebElement> suggestionList=driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
		Thread.sleep(1000);
		
		System.out.println(suggestionList.size());
		for(WebElement list:suggestionList) 
			System.out.println(list.getText());
	}
	
	//Closing browser
	@AfterTest
	public void teardown() 
	{
		driver.close();
	}
}
