package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlphabaticalOrder {

	WebDriver driver;

	@Test
	public void topmenus() {
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();
	}

	@Test
	public void register() {
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	}

	@Test
	public void signin() {
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	}

	@Test
	public void search() throws Exception {
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Java");
	//	driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Java"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.ENTER);
	}
	
	@Test
	public void mainmenus() {
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redmine.org/");
	}

	@AfterTest
	public void afterTest() {
	}

}
