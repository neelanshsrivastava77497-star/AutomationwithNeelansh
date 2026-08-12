package Learnning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Select_class {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		
		 
		 
		 Thread.sleep(3000);
		 
		 
		 
		 
		 
		 
		 driver.quit();
	}
}
