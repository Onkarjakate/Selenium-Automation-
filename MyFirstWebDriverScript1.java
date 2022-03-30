package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScript1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.adactinhotelapp.com");
		WebElement uname= driver.findElement(By.className("login_input"));
		uname.sendKeys("Onkarjakate1");
		driver.findElement(By.id("password")).sendKeys("YDSPUI");
		driver.findElement(By.className("login_button")).click();
		driver.quit();


	}

}
