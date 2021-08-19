package mypackage;

import java.awt.event.ItemEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleJQueryDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		driver.findElement(By.id("justAnInputBox")).click();

		// selectChoieValues(driver,"choice1");
		// selectChoieValues(driver,"choice1","choice2");
		// selectChoieValues(driver,"all");

	}

	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement items : choicelist) {
				String text = items.getText();
				for (String val : value) {
					if (text.equals(val)) {
						items.click();
						break;

					}
				}
			}

		} else {
			try {
				for (WebElement item : choicelist) {
					item.click();
				}

			} catch (Exception e) {

			}

		}
	}

}
