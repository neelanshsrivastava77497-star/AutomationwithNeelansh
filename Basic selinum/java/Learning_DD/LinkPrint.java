package Learning_DD;

import org.openqa.selinum.WebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPrint {

	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// First site find Links
		driver.get("https://flipkart.in/");
	List<WebElement> Links1 = driver.findElements(By.tagName("a"));
	int TotalLnks = Links1.size();
	System.out.println(Links1);
	
	 Thread.sleep(2000);
	
	 // 2nd  site find Links 
	driver.get("https://Amazon.in/");
	List<WebElement> Links2 =driver.findElements(By.tagName("a"));
	int TotalLinks=Links2.size();

	System.out.println(Links2);
	Thread.sleep(2000);
	
	
	driver.quit();

	
	
		
	}


		
	}

