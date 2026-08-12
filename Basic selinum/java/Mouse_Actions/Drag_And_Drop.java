package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	driver.get("https://automationwithpiyush.vercel.app/actions.html");

	Thread.sleep(5000);

	Actions act = new Actions(driver);
	
	//click and hold
	
//	WebElement hold = driver.findElement(By.id("hold-icon"));
//	act.clickAndHold(hold).pause(Duration.ofSeconds(3)).release().build().perform();
	
//	Thread.sleep(2000);
	
	//drag and drop laptop
	WebElement source = driver.findElement(By.id("prod-laptop"));
	WebElement destination = driver.findElement(By.id("cart-zone"));
	
	//approach -1
//	act.dragAndDrop(source, destination).build().perform();
//	Thread.sleep(2000);
	//approach-2
		act.dragAndDropBy( source, 230, 0).build().perform();
	
		Thread.sleep(2000);
		


	//drag and drop watch
		WebElement source1  = driver.findElement(By.id("prod-watch"));
		WebElement destination1 = driver.findElement(By.id("cart-zone"));
		
		//approach -1
//		act.dragAndDrop(source1 , destination1).build().perform();
//		Thread.sleep(3000);
		//approach-2
			act.dragAndDropBy( source, 200, 0).build().perform();
			Thread.sleep(2000);
		

		//drag and drop watch
			WebElement source3  = driver.findElement(By.id("prod-phone"));
	 		WebElement destination3= driver.findElement(By.id("cart-zone"));
			
			//approach -1
			act.dragAndDrop(source3 , destination3).build().perform();
			Thread.sleep(3000);
	
		//drag and drop watch
			WebElement source2 = driver.findElement(By.id("prod-headphones"));
				WebElement destination2 = driver.findElement(By.id("cart-zone"));
				
				//approach -1
				act.dragAndDrop(source2, destination2).build().perform();
			
				//approach-2
//					act.dragAndDropBy( source, 200, 0).build().perform();
			
	Thread.sleep(3000);
	driver.quit();
}
}
