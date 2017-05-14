package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class stepDefinition implements En {

	protected WebDriver driver;

	private static Logger log = Logger.getLogger(stepDefinition.class.getName());

	@Given("^I am a Facebook user$")
	public void i_am_a_facebook_user() {
		log.info("I am a Facebook user");
		System.setProperty("webdriver.chrome.driver", "E:\\sts_workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		/* driver.navigate().to("https://www.facebook.com/"); */
	}

	@When("^I enter my$")
	public void i_enter_my1() {
		log.info("I enter my");
		driver.findElement(By.id("email")).sendKeys("amitchaudhary.it@gmail.com");
	}

	@Then("^login should be successful$")
	public void _successful2() {
		log.info("login should be successful");
		driver.findElement(By.id("pass")).sendKeys("nothing");
		driver.findElement(By.id("u_0_v")).click();
	}

	@And("^I enter my home$")
	public void i_enter_my() throws Throwable {
		log.info("I enter my");
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test1 Pass");
		} else {
			System.out.println("Test1 Failed");
		}
		driver.close();
	}

	@But("^home page should not be missing$")
	public void home_page_should_not_be_missing() throws Throwable {
		log.info("home page should not be missing");
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test2 Pass");
		} else {
			System.out.println("Test2 Failed");
		}
		driver.close();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
