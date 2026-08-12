package Handling_Frames;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selinum.WebElement;

public class JS_POP_UP {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://automationwithpiyush.vercel.app/popups.html");
	
	Thread.sleep(3000);
	
	Alert ale = driver.switchTo().alert();
	
	ale.sendKeys("NEELANSH");
	ale.accept();
//	ale.dismiss();
//	ale.getText();
	
	
	
	Thread.sleep(3000);
	driver.quit();
	

	
}
}
