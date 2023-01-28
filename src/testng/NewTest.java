package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void mainmenu() {
     driver.findElement(By.xpath("//*[@id=\"top-menu\"]")).click();
}

  @Test
  public void register() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
 Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Aparna");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("helloMK@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_password_confirmation\"]")).sendKeys("helloMK@123");
	  Thread.sleep(2000);
 
	  driver.findElement(By.xpath("//*[@id=\"user_firstname\"]")).sendKeys("Nagothu");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_lastname\"]")).sendKeys("Aparna");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("aparna.nagothu@gmail.com");
  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"new_user\"]/input")).click();
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://redmine.org/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
