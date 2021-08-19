package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement drpcountryele = driver.findElement(By.id("input-country"));
		Select drpcountry = new Select(drpcountryele);
		drpcountry.selectByVisibleText("Denmark");
		drpcountry.selectByValue("10");// Argentina
		drpcountry.selectByIndex(6);// Angola

		//select option from dropdown without using methods  
		List<WebElement> alloptions = drpcountry.getOptions();
		for (WebElement options : alloptions) {
			if (options.getText().equals("Cuba")) {
				options.click();
				break;

			}

		}
	}

}
