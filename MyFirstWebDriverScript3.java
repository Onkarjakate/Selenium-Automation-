package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstWebDriverScript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.adactinhotelapp.com");
		driver.manage().window().minimize();


	}

}
