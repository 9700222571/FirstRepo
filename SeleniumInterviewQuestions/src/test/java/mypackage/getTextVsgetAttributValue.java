package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttributValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement username = driver.findElement(By.id("Email"));
		// username.clear();
		// username.sendKeys("merugu.harisha@gmail.com");

		// capturing text from tb
		System.out.println("getattribute() result is " + username.getAttribute("value"));
		System.out.println("getText() result is " + username.getText());// if innertext is available it will return else

		// login button
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getText());

		WebElement title = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
		System.out.println(title.getText());
	}

}
