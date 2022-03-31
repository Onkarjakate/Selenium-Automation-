package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AdactinHotelProjectPartOne  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Drivers2\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http:\\www.adactinhotelapp.com");
WebElement uname= driver.findElement(By.id("username"));
uname.sendKeys("Onkarjakate1");
driver.findElement(By.id("password")).sendKeys("YDSPUI");
driver.findElement(By.id("login")).click();
new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
new Select(driver.findElement(By.id("room_nos"))).selectByIndex(3);
//new Select(driver.findElement(By.id("datepick_in"))).selectByVisibleText("10/03/2022");
new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
new Select(driver.findElement(By.id("child_room"))).selectByIndex(3);
driver.findElement(By.id("Submit")).click();
driver.findElement(By.id("radiobutton_0")).click();
driver.findElement(By.id("continue")).click();
WebElement name = driver.findElement(By.id ("first_name"));
name.sendKeys("Onkar");
WebElement names = driver.findElement(By.id ("last_name"));
names.sendKeys("Jakate");
WebElement na = driver.findElement(By.id ("address"));
na.sendKeys("Somewhere on earth");
driver.findElement(By.id("cc_num")).sendKeys("1122334455667788");
new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("American Express");
new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("March");
new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
driver.findElement(By.id("cc_cvv")).sendKeys("787");
driver.findElement(By.id("book_now")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.id("my_itinerary")).click();
//driver.quit();
	}
	

}
