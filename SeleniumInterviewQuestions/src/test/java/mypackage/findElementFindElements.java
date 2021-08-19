package mypackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		// findElement ---return single WebElement
		/*
		 * // 1 WebElement searchbox =
		 * driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 * searchbox.sendKeys("ABC"); // 2 WebElement ele =
		 * driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		 * System.out.println(ele.getText()); // 3 WebElement searchbtn =
		 * driver.findElement(By.xpath("//button[normalize-space()='login']"));
		 */

		// findElements ---return multiple WebElement
		// 1
		List<WebElement> footervalues = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("size" + footervalues.size());// 22
		// 2
		//
		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("size" + logo.size());// 1
		//3
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		for (WebElement elements : links) {
		System.out.println(	elements.getText());
		}
		
		
	
	}

}
