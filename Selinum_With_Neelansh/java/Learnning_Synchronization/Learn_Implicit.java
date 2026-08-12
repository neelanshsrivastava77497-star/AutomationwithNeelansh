package Learnning_Synchronization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Learn_Implicit {


	
	
 
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			driver.get("https://automationwithpiyush.vercel.app/synchronization.html");

//			click on start process
			driver.findElement(By.xpath("//button[contains(text(), 'START')]")).click();

//			click on stop process
			driver.findElement(By.xpath("//button[contains(text(), 'STOP')]")).click();

//			click on trigger-display => unlock button
			driver.findElement(By.id("trigger-display")).click();

			
			// explicit wait
//			wait for element to be clickable
			WebElement td = driver.findElement(By.id("target-display"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(td));
			
//			clear the value from input
			td.clear();
//			InvalidElementStateException: 
//			Element is not currently interactable and may not be manipulated

//			type something in input
			td.sendKeys("admin");
//			ElementNotInteractableException: element not interactable
			
			
			
		
			
			Thread.sleep(3000);
			driver.quit();
		}
	}
	
