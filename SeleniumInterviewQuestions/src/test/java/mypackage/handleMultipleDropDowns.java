package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleMultipleDropDowns {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial-old/");

		// Select noOfEmpdrp=new Select (driver.findElement(By.name("NoOfEmployees")));
		// noOfEmpdrp.selectByVisibleText("16 - 20");
		// Select industrydrp=new Select (driver.findElement(By.name("Industry")));
		// noOfEmpdrp.selectByVisibleText("Retail");
		// Select countrydrp=new Select (driver.findElement(By.name("Country")));

//2
		WebElement noOfEmpEle = driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noOfEmpEle, "16 - 20");
		WebElement industrEle = driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(industrEle,"Healthcare");
		WebElement countryEle = driver.findElement(By.name("Country"));
	}

	public static void selectOptionFromDropDown(WebElement ele, String value) {

		Select drp = new Select(ele);

		List<WebElement> alloptions = drp.getOptions();
		for (WebElement options : alloptions) {
			if (options.getText().equals(value)) {
				options.click();
				break;
			}

		}

	}
}
