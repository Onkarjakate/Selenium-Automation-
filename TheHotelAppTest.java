package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TheHotelAppTest {
	public static Webdriver driver;
  @Test
  public void TestHotelApp() {
	  System.setProperty("webdriver.chrome.driver","F:\\Drivers2\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navvigate.().to("http://adactinhotelApp.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Opening Chrome Window");
  }

  @AfterMethod
  public void afterMethod() {
	driver.close();
	System.out.println("Closing Chrome Browser");
  }

}
