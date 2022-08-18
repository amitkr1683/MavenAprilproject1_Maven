package mavenSeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HRM_LoginText extends BaseTestSauceLab {

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

		// Validation step
		// Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

	}
	
	@Test
	public void testcase2() throws Exception {
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("AMIT");
		driver.findElement(By.id("last-name")).sendKeys("KUMAR");
		driver.findElement(By.id("postal-code")).sendKeys("831013");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		Thread.sleep(4000);
	}
	

}