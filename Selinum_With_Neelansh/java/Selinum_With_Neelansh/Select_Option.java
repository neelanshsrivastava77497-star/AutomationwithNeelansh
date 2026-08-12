package Selinum_With_Neelansh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Option {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.getTitle();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(
		
		By.xpath("//div[@class='oxd-select-text-input'])[1]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(
		By.xpath("//div[@role='option']//span[text()='Admin']"))).click();		
				
			
	
		
		driver.quit();
	}
}
