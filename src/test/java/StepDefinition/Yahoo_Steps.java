package StepDefinition;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Yahoo_Steps {
	WebDriver driver;

	@When("^Launch chrome and opens URL Yahoo registration page$")
	public void Launch_chrome_and_opens_URL_Yahoo_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
		System.out.println("First step is launch the browser and open yahoo URL");
	}

	@When("^fill the text boxes: First name, Last name, Email Address, Create password, Birth year$")
	public void fill_the_text_boxes_First_name_Last_name_Email_Address_Create_password_Birth_year() throws Throwable {

		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		WebElement Email = driver.findElement(By.id("usernamereg-userId"));
		WebElement Password = driver.findElement(By.id("usernamereg-password"));
		WebElement birthYear = driver.findElement(By.id("usernamereg-birthYear"));

		firstName.sendKeys("Amit");
		lastName.sendKeys("Kumar");
		Email.sendKeys("amit829812344");
		Password.sendKeys("ABCD@121");
		birthYear.sendKeys("1996");
	}

	@When("^click on Continue$")
	public void click_on_Continue() throws Throwable {
		WebElement login = driver.findElement(By.id("reg-submit-button"));
		login.click();
	}

	@When("^fill the correct number with correct contry code$")
	public void fill_the_correct_number_with_correct_contry_code() throws Throwable {

		WebElement dropdown = driver.findElement(By.name("shortCountryCode"));
		dropdown.findElement(By.xpath("//option[. = 'India ‪(+91)‬']")).click();
		WebElement phone = driver.findElement(By.id("usernamereg-phone"));
		phone.sendKeys("8298056838");

	}

	@When("^click on send code$")
	public void click_on_send_code() throws Throwable {
		WebElement sendcode = driver.findElement(By.id("reg-submit-button"));
		sendcode.click();
	}

	@When("^click on i'm not a robot$")
	public void click_on_i_m_not_a_robot() throws Throwable {
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		driver.switchTo().defaultContent();

	}

	@When("^click on Continue and enter the correct code and varify$")
	public void click_on_Continue_and_enter_the_correct_code_and_varify() throws Throwable {
		driver.findElement(By.id("recaptcha-submit")).click();
		{
			WebElement element = driver.findElement(By.id("recaptcha-submit"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
	}

	@Then("^after Fifteen sec close the browser$")
	public void after_Fifteen_sec_close_the_browser() throws Throwable {

		driver.wait(15000);
		driver.quit();

	}
}