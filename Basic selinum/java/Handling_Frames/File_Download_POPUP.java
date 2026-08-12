package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download_POPUP {
public static void main(String[] args) throws InterruptedException {
	

	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	driver.get("https://www.oracle.com/java/technologies/javase-jdk26-doc-downloads.html");
	
	Thread.sleep(2000);
	
//	driver.findElement(By.linkText("#license-lightbox")).click();
	driver.findElement(By.linkText("jdk-26.0.1_doc-all.zip")).click();
	Thread.sleep(2000);
	
	WebElement Element= driver.findElement(By.xpath("//input[@name='licenseAccept']"));
	Element.click();
	Thread.sleep(2000);
	

	   driver.findElement(By.xpath("//a[contains(@href,'jdk-26.0.1_doc-all.zip')]")).click();
	 
	Thread.sleep(5000);
	
	
	
	
	
	
	
	driver.quit();
}
}
