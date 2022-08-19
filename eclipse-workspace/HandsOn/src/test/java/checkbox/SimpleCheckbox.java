package checkbox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleCheckbox {

	WebDriver driver;

	//Launching browser
	@BeforeTest
	public void setup() throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\NJYOTI\\Desktop\\Selenium\\edgedriver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	}

	//Handling checkboxes
	@Test
	public void handleCheckbox() 
	{
		//Selecting a specific checkbox
		driver.findElement(By.xpath("//input[@id='monday']")).click();

		//Selecting multiple checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println(checkboxes.size());
		for(int i=0;i<checkboxes.size();i++) 
			checkboxes.get(i).click();

		//Selecting multiple checkboxes by choice
		for(WebElement ch:checkboxes) 
		{
			String chbx=ch.getAttribute("id");
			System.out.println(chbx);
			if(chbx.equals("monday") || chbx.equals("saturday")) 
				ch.click();
		}

		//Selecting first 3 checkboxes
		for(int i=0;i<checkboxes.size()-4;i++) 
		{
			checkboxes.get(i).click();
		}

		//Selecting last 2 checkboxes
		for(int i=checkboxes.size()-2;i<checkboxes.size();i++) 
		{
			checkboxes.get(i).click();
		}
	}

	//Closing browser
	@AfterTest
	public void teardown() 
	{
		//driver.close();
	}
}
