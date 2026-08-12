package Handling_Frames;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selinum.WebElement;

public class Hidden_divison_POPUP {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.easemytrip.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='aug 2026].../..//[text()='22'"));
	
	
	Thread.sleep(5000);
	driver.quit();
}
}
