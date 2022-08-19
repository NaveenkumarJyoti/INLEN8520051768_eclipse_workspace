package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsAndAction {
	//we'll learn about the difference between Actions class and Action interface
	
	WebDriver driver;
	
	//lauching a chrome browser
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NJYOTI\\Desktop\\Jars\\chromedriver104\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 1)
	public void runUsingActions() throws InterruptedException {
		WebElement searchBox=driver.findElement(By.name("q"));
		Thread.sleep(2000);
		Actions acts=new Actions(driver);
		acts.keyUp(searchBox,Keys.SHIFT).sendKeys("nbcu").keyDown(searchBox, Keys.SHIFT).perform();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void runUsingAction() throws InterruptedException {
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.clear();
		Thread.sleep(2000);
		Actions acts=new Actions(driver);
		acts.keyUp(searchBox, Keys.SHIFT);
		acts.sendKeys("oracle");
		acts.keyDown(searchBox, Keys.SHIFT);
		Action act=acts.build();
		act.perform();
	}
	
}
