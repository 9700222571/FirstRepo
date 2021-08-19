package mypackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class downloadFIle30 {

	public static void main(String[] args) {
		 	
		String location = System.getProperty("user.dir") + "\\Downloads\\";

		// chrome

		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

	}

}
