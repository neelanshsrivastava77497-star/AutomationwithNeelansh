package Learning_Locator;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;



public class practiceRelativeLocator {
 public static void main(String[] args) throws InterruptedException {
	 		ChromeDriver driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 		
	 		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
	 		
	 		WebElement un = driver.findElement(RelativeLocator
	 								.with(By.tagName("input"))
	 								.above(By.id("password"))
	 							);
	 		
	 		un.sendKeys("NEELANSH SRIVASTAVA");
	 		Thread.sleep(3000);
	 		
	 		WebElement ps = driver.findElement(RelativeLocator
	
	 								
	 								.with(By.id("password"))
	 								.below(By.tagName("input"))
	 							);
	 		ps.sendKeys("NEELANSH ");
	 		Thread.sleep(3000);
	 

	        // Terms checkbox
	        driver.findElement(By.cssSelector("input[type='checkbox']"))
	               .click();

	        Thread.sleep(1000);
	        // Login button - use dynamic locator
	        driver.findElement(
	            By.xpath("//button[contains(@id,'login')]")
	        ).click();

	 		
	
Thread.sleep(3000);
	 		driver.quit();
	 	}

 private static RelativeBy with(By tagName) {
	// TODO Auto-generated method stub
	return null;
 }
	 }

