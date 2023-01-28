package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DependsOnMethod {
	WebDriver driver;
	
  @Test(dependsOnMethods="method2")
  public void method1() {
	  driver.findElement(By.name("q")).sendKeys("Vijayawada");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

  }
  
  @Test
  public void method2() {
	  driver.get("https://www.google.com");
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F://lib//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
