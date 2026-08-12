package Selinum_With_Neelansh;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.HashFullpageScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Learning_Fullpage_SS {
public static void main(String[] args) throws InterruptedException, IOException {
    // Launch Chrome
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // Open website
    driver.get("https://www.Zomato.com");

    // Take Screenshot
   HasFullPageScreenshot hps = (HasFullPageScreenshot) driver;
   File source = hps.getFullPageScreenshotAs(OutputType.FILE);
   

    File destination = new File("./ScreenShots.java/Fullpage_SS.png");
    FileHandler.copy(source, destination);
Thread.sleep(3000);
    System.out.println("Screenshot captured successfully.");

    driver.quit();

}
}
