package Orange_HRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_jewelhouse {

    public static void main(String[] args) {

        // Setup ChromeDriver
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open myjewelhouse Demo Site
            driver.get("https://myjewelhouse.com/");
            driver.manage().window().maximize();

            // Enter Username
            WebElement username = driver.findElement(
                    By.name("username"));
            username.sendKeys("Admin");

            // Enter Password
            WebElement password = driver.findElement(
                    By.name("password"));
            password.sendKeys("admin123");

            // Click Login
            driver.findElement(
                    By.xpath("//button[@type='submit']"))
                    .click();

            // Verify Dashboard
            String currentUrl = driver.getCurrentUrl();

            if (currentUrl.contains("dashboard")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
    //        driver.quit();
        }
    }
}