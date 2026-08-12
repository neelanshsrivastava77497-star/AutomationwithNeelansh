package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
 
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			driver.get("https://automationwithpiyush.vercel.app/actions.html");

			Thread.sleep(3000);

			Actions act = new Actions(driver);

			// hover me
			WebElement rc= driver.findElement(By.xpath("//button[contains(text(),'Hover')]"));
		act.moveToElement(rc).perform();
			
			//right-click methods
		WebElement rc1 = driver.findElement(By.id("right-click-area"));
			act.moveToElement(rc1).contextClick().build().perform();
			act.contextClick(rc1).build().perform();

			act.release().build().perform();
			Thread.sleep(3000);
			
			//left -click methods
//			WebElement rc2 = driver.findElement(By.id("click-box"));
//			act.moveToElement(rc2).contextClick().click();
//			act.contextClick(rc2).build().perform();
			act.release().build().perform();
			
			// click and hold methods
	//		WebElement hold = driver.findElement(By.id("hold-icon"));

		//	act.moveToElement(hold).clickAndHold().build().perform();
	//		act.clickAndHold(hold).build().perform();
	//		Thread.sleep(3000);
//			act.release().build().perform();
			
			//drag and drop
			WebElement source = driver.findElement(By.id("prod-laptop"));
			WebElement destination = driver.findElement(By.id("card-zone"));
			
			//approach -1
			act.dragAndDrop(source, destination).build().perform();
			
			//approach-2
	//		act.dragAndDropBy( source, 230, 0).build().perform();
			
			Thread.sleep(3000);
			
			
			//double -click methods
			WebElement rc3 = driver.findElement(By.id(" Db-text"));
			act.moveToElement(rc3).doubleClick().click();
			act.doubleClick(rc3).build().perform();
			
			act.release().build().perform();
			
			
			
			driver.quit();
		}
	}
	
	


		


