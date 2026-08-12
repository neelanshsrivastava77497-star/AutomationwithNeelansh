package Selinum_With_Neelansh;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MYJEWELHOUSE {

	

	    public static void main(String[] args) throws InterruptedException {

	        // Launch Chrome Browser
	        WebDriver driver = new ChromeDriver();

	        // Maximize Browser
	        driver.manage().window().maximize();

	        // Open Website
	        driver.get("https://myjewelhouse.com/");
                     Thread.sleep(3000);
	        // Print Title
	        System.out.println("Page Title: " + driver.getTitle());

	        // Verify Logo
	        WebElement logo = driver.findElement(By.tagName("img"));

	        if (logo.isDisplayed()) {
	            System.out.println("PASS - Homepage loaded successfully.");
	        } else {
	            System.out.println("FAIL - Homepage not loaded.");
	        }

	        // Verify Current URL
	        String actualURL = driver.getCurrentUrl();
	        String expectedURL = "https://myjewelhouse.com/";

	        if (actualURL.equals(expectedURL)) {
	            System.out.println("URL Verification Passed");
	        } else {
	            System.out.println("URL Verification Failed");
	        }
	        
	        
	        //click on home page
	        driver.findElement(By.linkText("Home")).click();
	        System.out.println("HOME PAGE OPEN");
               Thread.sleep(2000);
               
               
   	        //click on about us page
   	        driver.findElement(By.linkText("About Us")).click();
   	        System.out.println("About us page open");
                  Thread.sleep(2000);
   	        
                  //click on about us page
         	        driver.findElement(By.linkText("Shop")).click();
         	        System.out.println("Shop  page open");
                        Thread.sleep(2000);
         	        
                        
                        //click on about us page
               	        driver.findElement(By.linkText("Blog")).click();
               	        System.out.println("Blog page open");
                              Thread.sleep(2000);
             
                              //click on about us page
                     	        driver.findElement(By.linkText("Contact Us")).click();
                     	        System.out.println("contact us page open");
                                    Thread.sleep(2000);
                     	                                  
                                    //click on about us page
                    //    	        driver.findElement(By.linkText("My Account")).click();
                      //   	        System.out.println("My Account  page open");
                    //                    Thread.sleep(2000);
                         	        
                                        //click on about us page
                            	        driver.findElement(By.linkText("Wishlist")).click();
                           	        System.out.println("Wishlist page open");
                                          Thread.sleep(2000);
                             	        
               
               
                                    
	        // Close Browser
	        driver.quit();
	    }
	}

