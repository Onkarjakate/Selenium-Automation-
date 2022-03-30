package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstWebDriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http:\\www.adactinhotelapp.com");
WebElement uname= driver.findElement(By.cssSelector("#username"));
uname.sendKeys("Onkarjakate1");
driver.findElement(By.cssSelector("#password")).sendKeys("YDSPUI");
driver.findElement(By.cssSelector("#login")).click();
driver.quit();
	}
	

}
