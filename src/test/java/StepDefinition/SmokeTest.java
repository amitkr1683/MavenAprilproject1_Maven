package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^Open the chrome and start application$")
	public void Open_the_chrome_and_start_application() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("First step will launch the browser");
	}
	
	@When("^I enter valid username and valid password$")
	 public void I_enter_valid_username_and_valid_password() throws Throwable{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		System.out.println("Second step will enter uname and password and will login");
	}
	
	@Then("^User should be able to login succesfully after 10sec logout and teardown$")
	 public void User_should_be_able_to_login_succesfully_after_10sec_logout_and_teardown() throws Throwable{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Third step will logout and close browser");
	}
}