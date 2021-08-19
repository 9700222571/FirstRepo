package mypackage;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadFile {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
		
		//using send keys
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("E:\\Testing_pro\\123.pdf");
		//using robo class 
	WebElement button=	driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);//click action button
	//copy the path
		//past the path 
		//enter
		
		Robot rb=new Robot();
		rb.delay(2000);
		//put path to file in a clipboard
		StringSelection ss=new StringSelection("E:\\Testing_pro\\123.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//ctrl+V
		rb.keyPress(KeyEvent.VK_CONTROL);//press on control key
		rb.keyPress(KeyEvent.VK_V);//press on v key
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	
	}

}
