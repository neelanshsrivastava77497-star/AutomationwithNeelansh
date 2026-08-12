package Automate_ParaBank;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selinum.WebElement;


public class PARA_TS{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://parabank.parasoft.com/");
		
		Thread.sleep(3000);
		

		driver.findElement(By.name("username")).sendKeys("NEELANSH ");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("password")).sendKeys("NEELANSH@191");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
	}
	
}