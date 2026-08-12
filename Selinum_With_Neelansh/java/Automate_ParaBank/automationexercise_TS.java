package Automate_ParaBank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class automationexercise_TS {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://automationexercise.com/");
	
	Thread.sleep(5000);
	driver.quit();
}
}
