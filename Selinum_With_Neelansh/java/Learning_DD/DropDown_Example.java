package Learning_DD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Example {

	    public static void main(String[] args) throws InterruptedException {
	        // 1. Initialize your WebDriver 
	        WebDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://automationwithpiyush.vercel.app/dropdown.html");

//			handle single select dropdown
			org.openqa.selenium.WebElement ssDD = driver.findElement(By.id("single-select"));
			Select selSingle = new Select(ssDD);
			selSingle.selectByIndex(5);
			
Thread.sleep(2000);


        driver.quit();
    }

	    }
	    

