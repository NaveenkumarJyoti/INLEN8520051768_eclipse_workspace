package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseActions {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NJYOTI\\Desktop\\Jars\\chromedriver104\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void run() throws InterruptedException {
		//Right click
		//driver.navigate().to("https://www.nike.com/in/w/mercurial-football-shoes-1gdj0z4f1bzy7ok");
		//WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Nike Mercurial Superfly 8 Elite FG')]"));
		Actions act=new Actions(driver);
//		Thread.sleep(2000);
//		act.contextClick(ele).perform();
//		Thread.sleep(1500);
		
		//Double Click
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement btn=driver.findElement(By.xpath("//button[@name='dblClick']"));
		act.doubleClick(btn).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept(); //Clicking OK in alert
		
		//Drag and drop
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(1000);
				
		//mouse hover 
		WebElement hover=driver.findElement(By.xpath("//div[@id='div2']"));
		act.moveToElement(hover).perform();
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(1500);
		
		WebElement desktop=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][contains(text(),'Desktops')]"));
		WebElement mac=driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
		act.moveToElement(desktop).moveToElement(mac).click().perform();
	}
}
// url for drag & drop-'http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html' --> work on dragging multiple elements to desired destinations