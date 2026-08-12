package Orange_HRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.getTitle();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 

			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(2000);
		 
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(2000);
		 
		
		
	//	driver.findElement(By.xpath ("//input//type//class")).click();
		   // Click Login
        driver.findElement(
                By.xpath("//button[@type='submit']"))
                .click();
      
		Thread.sleep(5000);
		  // Verify Dashboard
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("dashboard")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

    
		 
		 driver.quit();
	}
	}