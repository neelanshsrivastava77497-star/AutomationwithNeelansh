package Mouse_Actions;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Zomato {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			driver.get("https://www.zomato.com/");

//			scroll to element
			Actions act = new Actions(driver);
			
			WebElement element = driver.findElement(By.xpath("//div[text()='blinkit']"));
			
			act.scrollToElement(element).perform();
			
//			act.scrollByAmount(0, 800).perform();
//			Thread.sleep(1000);
//			act.scrollByAmount(0, 800).perform();
//			Thread.sleep(1000);
//			act.scrollByAmount(0, 800).perform();
			
			act.scrollByAmount(0, 800)
				.pause(Duration.ofSeconds(1))
				.scrollByAmount(0, 800)
				.pause(Duration.ofSeconds(1))
				.scrollByAmount(0, 800).perform();
			System.out.println("FIND Successfully");
			Thread.sleep(7000);

		
			driver.quit();
		}
	}

