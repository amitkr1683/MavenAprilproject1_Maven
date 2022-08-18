package mavenSeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Chrome_drivers {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void closeApp() throws Exception {
	Thread.sleep(4000);
	driver.close();
	}
}