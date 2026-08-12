package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_pop_up {
private static final ChromeDriverService ChromeOtions = null;

public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions setting = new ChromeOptions();
	setting.addArguments("--disable-notifications");
	

	WebDriver driver = new ChromeDriver(ChromeOtions);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://easemytrip.com/");
	Thread.sleep(8000);
	driver.quit();
}
}
