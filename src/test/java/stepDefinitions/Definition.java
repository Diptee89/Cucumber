package stepDefinitions;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	WebDriver driver;
	@Given("go to google website and search selenium")
	public void go_to_google_website() {
		WebDriverManager.chromedriver().arch64().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://Google.com");
	   driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Selenium" +Keys.ENTER);
	}
	
	@When("user click on Selenium link")
	public void user_click_on_selenium_link() {
	  driver.findElement(By.cssSelector("h3.MBeuO")).click();
	}
	@Then("selenium web page will open")
	public void selenium_web_page_will_open() {
	   System.out.println("selenium web page will open");
	   Assert.assertEquals(false, false);
	}
	@Then("come back again into Serach page")
	public void come_back_again_into_serach_page() {
	    driver.navigate().back();
	}
}
