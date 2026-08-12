package Learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heroMu2 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https: the-internet.herokuapp.com/dynamic-contrls");
		
		driver.findElement(null);
		driver.findElement(null);
		driver.findElement(null);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(null);
	//	driver.findElements("//button[text(),'disable'])")).click();
		
		
	}

}
