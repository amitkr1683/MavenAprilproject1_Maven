package mavenSeleniumProject1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SwagLabsWebsite_practise extends Chrome_drivers {

	@Test
	public void testcase1() throws Exception {
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
