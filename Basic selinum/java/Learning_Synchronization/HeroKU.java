package Learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKU {

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	

		driver.findElement(By.xpath("//button[@autocomplete=\"off\"]")).click();
		

		driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();

		driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();

		driver.findElement(By.xpath("//button[text()=\"Enable\"]")).click();


		driver.findElement(By.xpath("//button[text()=\"Disable\"]")).click();

		driver.quit();
	}

	}

