package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHotelApplicationTest {
	public static WebDriver driver;
	public static String expectedTitle = "Adactin.com - Search Hotel";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		WebElement uname = driver.findElement(By.id ("username"));
		uname.sendKeys("Onkarjakate1"); 
		driver.findElement(By.id("password")).sendKeys("YDSPUI");
		driver.findElement(By.id("login")).click();	
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle,actualTitle);
	
	}

}
