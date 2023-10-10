package testRunners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {
	WebDriver driver;

	@Test
	public void m1() {
		WebDriverManager.chromedriver().arch64().setup();

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Google.com");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Selenium" + Keys.ENTER);
//		 driver.findElement(By.cssSelector("h3.MBeuO")).click();
//		 driver.navigate().back();
	}

}
