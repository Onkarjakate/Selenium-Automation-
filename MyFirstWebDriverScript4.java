package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstWebDriverScript4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.adactinhotelapp.com");
		driver.navigate().to("http:\\www.google.com");
		driver.navigate().back();
		driver.navigate().forward();


	}

}
