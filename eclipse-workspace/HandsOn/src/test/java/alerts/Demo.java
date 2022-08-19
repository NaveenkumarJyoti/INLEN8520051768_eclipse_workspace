package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;

	//Launching browser
	@BeforeTest
	public void setup() throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\NJYOTI\\Desktop\\Jars\\edgedriver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	}

	//handle alerts
	@Test
	public void alerts() throws InterruptedException {
		Thread.sleep(3000);
		
		//simple js alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		
		//js confirmation alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(1500);
		driver.switchTo().alert().dismiss();
		
		//js alert with input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(1500);
		Alert alertWindow=driver.switchTo().alert();
		alertWindow.sendKeys("Hey there! Happy learning...");
		Thread.sleep(1500);
		alertWindow.accept();
	}

	//Closing browser
	@AfterTest
	public void teardown() 
	{
		driver.close();
	}
}
