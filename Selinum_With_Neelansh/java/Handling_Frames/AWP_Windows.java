package Handling_Frames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Windows {

	
	public static void main(String[] args) throws InterruptedException {
		
	
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://automationwithpiyush.vercel.app/");
	
//step 1 get the home address
	String  PID = driver.getWindowHandle();
	
	
	//step 2  perform the task which will open new tabs/windows
	driver.findElement(By.cssSelector("button[onclick='openSocialChannels()']")).click();
	
	
	// step  3 get all the windows/tab address 
	
	Set<String>CIDs = driver.getWindowHandles();
	
	//  enter into each & every windows one -by- one 
	 
	
	 for(String i : CIDs) {
		 driver.switchTo().window(i);
		 System.out.println("Current window title:"+ driver.getTitle());
		 
		 // step 5 break the loop where condition meets
		 if(driver.getCurrentUrl().contains("github")) {
			 System.out.println("here loop will be brken");
			 break;
		 }
		 
		 //step 6 perform the task on desired window
		 Thread.sleep(3000);
		 driver.close();
		 
		 
		 // get back home 
		 driver.switchTo().window(PID);
		 driver.quit();
		 
		 
	
	 }
	
}

}