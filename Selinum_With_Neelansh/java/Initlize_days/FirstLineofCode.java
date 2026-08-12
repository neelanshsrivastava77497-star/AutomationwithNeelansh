package Initlize_days;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.decorators.WebDriver ;

public class FirstLineofCode {

	public static <RemotewebDriver> void main(String[]args) throws InterruptedException {
		
		 ChromeDriver Driver = new ChromeDriver();
		 
		 Driver.manage().window().maximize();
//		 Driver.manage().window().minimize();
//		Driver.manage().window().fullscreen();
//		Driver.manage().window().getSize();
	
		
		
		Driver.get("https://myjewelhouse.com/");
		
		Thread.sleep(2000);
      
		
		 Driver.close();
		 
		
	}
}

