package Selinum_With_Neelansh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRM_Testscript {
 
	private static final WebElement WindowsLink = null;

	public static void main(String[] args) throws InterruptedException {
		
	    	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		// 1st task register  e
		//click on my account 
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		// click on register 
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);

		WebDriverWait wait =new WebDriverWait (driver,Duration.ofSeconds(15));
		
		
	      	 driver.findElement(By.id("input-firstname")).sendKeys("Neelansh");

		        driver.findElement(By.id("input-lastname")).sendKeys("Srivastava");

		        String email = "neelansh1906@gmail.com";

		        driver.findElement(By.id("input-email")).sendKeys(email);

		        driver.findElement(By.id("input-telephone"))
		                .sendKeys("8795621777");

		        driver.findElement(By.id("input-password"))
		                .sendKeys("Test@123");

		        driver.findElement(By.id("input-confirm"))
		                .sendKeys("Test@123");

		      
		        driver.findElement(By.name("agree")).click();

		        // Click Continue
		        driver.findElement(By.xpath("//input[@value='Continue']")).click();
		        System.out.println("Registration Successful");
		        Thread.sleep(3000);
		        
		        // 2nd task login 
		        
		        driver.findElement(By.xpath("//span[text()='My Account']")).click();
				Thread.sleep(2000);
		        driver.findElement(By.linkText("Login")).click();
				Thread.sleep(2000);
		  
		
				

		        // Enter Email
		        WebElement email1 = driver.findElement(By.id("input-email"));
		        email1.sendKeys("neelanshsrivastava1906gmail.com");

		        // Enter Password
		        WebElement password = driver.findElement(By.id("input-password"));
		        password.sendKeys("Test@123");

		        // Click Login Button
		        driver.findElement(By.xpath("//input[@value='Login']")).click();

		        Thread.sleep(3000);

		        // Verify Login
		        String expectedTitle = "My Account";
		        String actualTitle = driver.getTitle();

		        if (actualTitle.contains(expectedTitle)) {
		            System.out.println("Login Successful");
		        } else {
		            System.out.println("Login Failed");
		        }
		        Thread.sleep(2000);
		        // 3rd task click on desktops
		        WebElement desktopsLink = driver.findElement(By.linkText("Desktops"));
	            desktopsLink.click();

		    System.out.println("click on desktop");
		        Thread.sleep(2000);
		        WebElement PcLink = driver.findElement(By.linkText("PC (0)"));
	            PcLink.click();
	            System.out.println("click on PC");
                 Thread.sleep(2000);
		        
               WebElement desktopsLink1 = driver.findElement(By.linkText("Desktops"));
                desktopsLink1.click();
                 Thread.sleep(2000);
		        WebElement MacLink = driver.findElement(By.linkText("Mac (1)"));
	            MacLink.click();
	            System.out.println("click on Mac");
                  Thread.sleep(2000);
                  //click on Laptops and notebooks
                  
                  WebElement LaptopsLink1 = driver.findElement(By.linkText("Laptops & Notebooks"));
                   LaptopsLink1.click();
                   Thread.sleep(2000);
                   WebElement MacsLink = driver.findElement(By.linkText("Macs (0)"));
   	            MacsLink.click();
   	            System.out.println("click on Macs");
                    Thread.sleep(2000);    
                    WebElement LaptopsLink2 = driver.findElement(By.linkText("Laptops & Notebooks"));
                    LaptopsLink2.click();
                    Thread.sleep(2000);
                    WebElement WindowssLink = driver.findElement(By.linkText("Windows (0)"));
       	            WindowssLink.click();
       	            System.out.println("click on Windows");
                        Thread.sleep(2000);
                        WebElement LaptopsLink3 = driver.findElement(By.linkText("Laptops & Notebooks"));
                        LaptopsLink3.click();
                 Thread.sleep(2000);
     // click on components	
                      WebElement ComponentsLink = driver.findElement(By.linkText("Components"));
                    ComponentsLink.click();
                    System.out.println("click on components");
                      Thread.sleep(2000);
    //click on tablets
                      WebElement TabletssLink = driver.findElement(By.linkText("Tablets"));
                      TabletssLink.click();
                      System.out.println("click on Tablets");
                        Thread.sleep(2000);
   // click on software
                        WebElement SoftwaresLink = driver.findElement(By.linkText("Software"));
                        SoftwaresLink.click();
                        System.out.println("click on Software");
                          Thread.sleep(2000);
    //click on phones & PDAs
                          WebElement PhonesLink = driver.findElement(By.linkText("Phones & PDAs"));
                          PhonesLink.click();
                          System.out.println("click on Phones & PDAs");
                            Thread.sleep(2000);
     // click on Cameras                
                            WebElement CamerasLink = driver.findElement(By.linkText("Cameras"));
                            CamerasLink.click();
                            System.out.println("click on Cameras");
                              Thread.sleep(2000); 
                              
                              
    // click MP3 Players
                              WebElement MP3PlayersLink = driver.findElement(By.linkText("MP3 Players"));
                              MP3PlayersLink.click();
                              System.out.println("click on MP3 Players");
                                Thread.sleep(2000);
			 driver.quit();
	}
}
