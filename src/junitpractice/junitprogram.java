package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class junitprogram {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	@Test
	void test1() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void test2() {
		driver.get("www.facebook.com");
	}
	
	@Test
	void test3() {
		driver.get("www.twitter.com");

	}

}
