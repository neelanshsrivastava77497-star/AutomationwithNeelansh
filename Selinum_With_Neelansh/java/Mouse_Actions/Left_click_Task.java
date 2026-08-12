package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Left_click_Task {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	driver.get("https://automationwithpiyush.vercel.app/actions.html");

	Thread.sleep(3000);

	Actions act = new Actions(driver);
	//left -click methods
	WebElement rc2 = driver.findElement(By.id("click-box"));
	act.moveToElement(rc2).contextClick().click();
	act.contextClick(rc2).build().perform();
	act.release().build().perform();

Thread.sleep(7000);
driver.quit();
}
}
