package Selinum_With_Neelansh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_CheckBrowser {


	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/menu");

	        // Locate the element
	        WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

	        // Create Actions object
	        Actions action = new Actions(driver);

	        // Perform Mouse Hover
	        action.moveToElement(menu).perform();

	        System.out.println("Mouse Hover Performed");

	        // Close browser
	         driver.quit();
	    }
	}
