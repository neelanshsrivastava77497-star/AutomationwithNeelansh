package Learning_DD;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selinum.WebElement;

public class AWP_MultiDD {
	
	public static void main(String[]args0) throws InterruptedException {


	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
				
//				handle single select dropdown
				org.openqa.selenium.WebElement ssDD = driver.findElement(By.id("single-select"));
				Select selSingle = new Select(ssDD);
				selSingle.selectByIndex(4);
				
	


				

//				handle multi select dropdown
				org.openqa.selenium.WebElement msDD = driver.findElement(By.id("multi-select"));
				Select selMulti = new Select(msDD);
				selMulti.selectByVisibleText("Python");
			selMulti.selectByVisibleText("Git");
				selMulti.selectByVisibleText("TestNG");
				
				
			Thread.sleep(3000);
				driver.quit();
			}
		

		
		
	}


