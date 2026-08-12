package Handling_Frames;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selinum.WebElement;

public class Authenticate_POPUP {
public static void main(String[] args) throws InterruptedException {
	
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//	driver.get("https://admin:admin@repodemo.instacks.com/demo/basic-auth/");
	driver.get("https://authorized:password001@testpages.herokuapp.com/styled/basic-auth/basic-auth-results.html");
	
	
	Thread.sleep(5000);
	driver.quit();
	
	
}
}
