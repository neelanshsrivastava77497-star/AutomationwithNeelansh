package Selinum_With_Neelansh;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Swiggy_SS_method {


    public static void main(String[] args) throws IOException, InterruptedException {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://www.swigy.com");

      
        // Take Screenshot
        TakesScreenshot tks = (TakesScreenshot) driver;
        File source = tks.getScreenshotAs(OutputType.FILE);
       File F4 = new File("./ScreenShots.java/Swiggy_SS.png");

        File destination = new File("./ScreenShots.java/Swiggy_SS.png");
        FileHandler.copy(source, destination);
Thread.sleep(3000);
        System.out.println("Screenshot captured successfully.");

        driver.quit();
    }
}

