package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Description {
	WebDriver driver;
	
  @Test
  public void f1() {
  }
  
  
  @Test
  public void f2() {
  }
  
  @Test
  public void f3() {
  }
  
  @Test
  public void f4() {
  }
  
  @Test
  public void f5() {
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://redmine.org/");
  }

}
