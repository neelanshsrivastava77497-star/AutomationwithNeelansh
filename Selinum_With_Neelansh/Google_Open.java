package Selinum_With_Neelansh;


 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


 
import org.openqa.selinum.Actions;

public class Google_Open {
public static void main(String[] args) throws InterruptedException {
	
	
	   

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        // Open Google
	        driver.get("https://www.google.com");

	        // Click Google Apps (9-dot icon)
	        WebElement apps = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//a[@aria-label='Google apps']")));
	        apps.click();

	        // Switch to Google Apps iframe
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
	                By.xpath("//iframe[contains(@src,'widget')]")));

	        // Click YouTube
	        WebElement youtube = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//span[text()='YouTube']")));
	        youtube.click();

	        // Return to default content
	        driver.switchTo().defaultContent();

	        System.out.println("YouTube opened successfully!");

	         driver.quit();
	    }
	}
    
   


 