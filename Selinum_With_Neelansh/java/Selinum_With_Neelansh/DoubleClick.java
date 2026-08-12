package Selinum_With_Neelansh;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

   public class DoubleClick {
	



	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/buttons");

	        // Locate the Double Click button
	        WebElement button = driver.findElement(By.id("doubleClickBtn"));

	        // Create Actions object
	        Actions action = new Actions(driver);

	        // Perform Double Click
	        action.doubleClick(button).perform();

	        System.out.println("Double Click Performed");

	        // Verify the message
	        WebElement message = driver.findElement(By.id("doubleClickMessage"));

	        System.out.println(message.getText());

	        // driver.quit();
	    }
	}

