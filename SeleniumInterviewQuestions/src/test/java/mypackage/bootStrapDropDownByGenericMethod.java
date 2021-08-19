package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootStrapDropDownByGenericMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		// Product Type
		List<WebElement> produttype = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("noOfOptions: " + produttype.size());
		
		selectOptionFromDropDown(produttype, "Deposits");
		/*
		 * for (WebElement pty : produttype) { if (pty.getText().equals("Deposits")) {
		 * pty.click(); break; }
		 * 
		 * }
		 */
		// Product
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println("product size: " + products.size());
		
		selectOptionFromDropDown(products, "Fixed Deposit");

	}

	public static void selectOptionFromDropDown(List<WebElement> options, String value) {
		for (WebElement pty : options) {
			if (pty.getText().equals(value)) {
				pty.click();
				break;
			}

		}
	}
}
