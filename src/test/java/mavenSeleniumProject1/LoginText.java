package mavenSeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginText extends Chrome_drivers {

	@Test
	public void testcase1() throws Exception {

		// locator
		// driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.name("Submit")).click();

		// Action -getText
		// String actualErrorMessage =
		// driver.findElement(By.id("spanMessage")).getText();
		// System.out.println("Error Message:" + actualErrorMessage);

		// String expectedErrorMessage = "Password cannot be empty";

		// driver.manage().window().setSize(new Dimension(1382, 744));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Logout")).click();
		//driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		driver.navigate().to("https://www.javatpoint.com/");   
		
        //Scroll down the webpage by 4500 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)");  
		
		// Validation step
		// Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

	}

}