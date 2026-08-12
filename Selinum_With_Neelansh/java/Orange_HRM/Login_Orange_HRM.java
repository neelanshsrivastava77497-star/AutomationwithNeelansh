package Orange_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Orange_HRM {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        
      //  try {
            // Open OrangeHRM Demo Site
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            // Enter Username
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("Admin");
            Thread.sleep(3000);

            // Enter Password
            WebElement password = driver.findElement(
                    By.name("password"));
            password.sendKeys("admin123");
Thread.sleep(3000);
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