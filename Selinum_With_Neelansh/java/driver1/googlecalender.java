package driver1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlecalender {


	////a[contains(@href,'https://calendar.google.com/calendar?authuser=0')]

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//a[@class='gb_C']")).click();
			
			   // Switch to Google Apps iframe
	        WebElement frame = driver.findElement(By.xpath("//iframe"));
	        driver.switchTo().frame(frame);

			driver.findElement(By.xpath("//span[text()='Calendar']")).click();
			Thread.sleep(4000);
			driver.quit();
}
}

