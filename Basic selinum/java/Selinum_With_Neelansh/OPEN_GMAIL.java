package Selinum_With_Neelansh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPEN_GMAIL {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(110));

        driver.get("https://www.google.com");

        // Click Google Apps icon
        driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();

        // Switch to Google Apps iframe
        WebElement frame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        // Photos
    //    driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
  //      driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        driver.findElement(By.xpath("//span[text()='Gmail']")).click();

        Thread.sleep(100000);
        driver.quit();
    }
}
