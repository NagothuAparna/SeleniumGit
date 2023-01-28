package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown {
	
	WebDriver driver;
	
	
  @Test
  public void dropDown() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("520010");
	  Thread.sleep(3000);
	  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Angola");
	  
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F://lib//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
