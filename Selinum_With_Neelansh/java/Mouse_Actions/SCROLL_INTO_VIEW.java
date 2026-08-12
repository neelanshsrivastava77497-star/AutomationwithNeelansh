
	package Mouse_Actions;



	import java.time.Duration;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

public class SCROLL_INTO_VIEW {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	//		driver.get("https://www.zomato.com/");
	//		downcasting
			JavascriptExecutor jse = (JavascriptExecutor) driver;

//			navigate to url
			jse.executeScript("window.location='https://www.zomato.com/'");
			Thread.sleep(2000);
//			
////			scroll to 0, 500 then add 200px more
		jse.executeScript("window.scrollTo(0,500)"); // absolute scrolling
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0,700)"); // Relative scrolling
			Thread.sleep(3000);
			
			WebElement blinkit = driver.findElement(By.xpath("//div[text()='blinkit']"));
			
			 jse.executeScript("arguments[0].scrollIntoView(false);",blinkit);
			Thread.sleep(2000);

			 jse.executeScript("arguments[0].scrollIntoView(true);",blinkit);
			Thread.sleep(3000);
			driver.quit();
		
	}


}
