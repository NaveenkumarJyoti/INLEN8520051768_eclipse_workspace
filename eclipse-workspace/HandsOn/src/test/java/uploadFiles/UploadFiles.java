package uploadFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFiles {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NJYOTI\\Desktop\\Jars\\chromedriver104\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.monsterindia.com");
	}
	
	@Test
	public void run() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		Thread.sleep(1500);
		
		//uploading a file using sendKeys()
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\NJYOTI\\Desktop\\CV & cert\\NaveenkumarJyoti CV.doc");
		Thread.sleep(2000);
		
		//uploading a file using Robot class methods
/*		driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		unable to click, thus using js to operate click operation */
		WebElement uploadBtn=driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", uploadBtn);
		
		/* copy the path
		 paste 
		 enter */
		Robot rob=new Robot();
		rob.delay(2000);
		
		//copying the file path
		StringSelection ss=new StringSelection("C:\\Users\\NJYOTI\\Desktop\\CV & cert\\Naviin CV.docx");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste the filepath into clipboard
		rob.keyPress(KeyEvent.VK_CONTROL); //press CTRL
		rob.keyPress(KeyEvent.VK_V);       //press V
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		//Press enter 
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.close();
	}
	
}
