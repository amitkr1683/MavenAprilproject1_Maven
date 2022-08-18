package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps1 {
	WebDriver driver;

	@Given("user Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launch the chrome browser");
	}

	@When("user opens URL \"(.*?)\"$")
	public void user_opens_URL(String arg1) throws Throwable {
		driver.get("https://admin-demo.nopcommerce.com/login");
		// throw new PendingException();
	}

	@When("user enters Email as \"(.*?)\" and passwords as \"(.*?)\"$")
	public void user_enters_Email_as_and_passwords_as(String arg1, String arg2) throws Throwable {

		// driver.findElement(By.id("txtUsername")).click();
		// driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		// driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
	}

	@When("click on Login$")
	public void click_on_Login() throws Throwable {
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

	}

	@Then("page Title Should be \"(.*?)\"$")
	public void page_Title_Should_be(String arg1) throws Throwable {
		// throw new PendingException();
	}

	@When("user click on Logout link$")
	public void user_click_on_Logout_link() throws Throwable {

		// throw new PendingException();
		// Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();

		System.out.println("user click on Logout link");
	}

	@Then("page title should be \"(.*?)\"$")
	public void page_title_should_be(String arg1) throws Throwable {

		// throw new PendingException();

	}

	@Then("close browser$")
	public void close_browser() throws Throwable {
		Thread.sleep(10000);
		driver.quit();
		System.out.println("Closing the browser");

	}

}