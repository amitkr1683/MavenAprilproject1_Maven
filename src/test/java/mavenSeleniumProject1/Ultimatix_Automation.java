package mavenSeleniumProject1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Ultimatix_Automation extends Chrome_drivers {

	@Test
	public void testcase1() throws Exception {
		driver.get("https://www.ultimatix.net");    // Performing automation on this link
		driver.findElement(By.id("form1")).sendKeys("1558326");
		driver.findElement(By.id("proceed-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("password-btn")).click();
		Thread.sleep(300000);
		//driver.findElement(By.id("password-login")).click();
		driver.findElement(By.id("password-login")).sendKeys("Oxu549@121");
		driver.findElement(By.id("form-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"mainBody\"]/div[1]/div/div/div[2]/div[1]/nav/div/div[2]/div[2]")).click();
		
		// below xpath not working
		driver.findElement(By.xpath("//*[@id=\"MegamenuBasic\"]/div/div[4]/table[1]/tbody/tr[7]/td/div/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mainBody\"]/div[1]/div/div/div[3]/div[1]/div[2]/div/div/div/div/ui-view/div/ng-include/div/div[1]/div/button")).click();
				
	}
}