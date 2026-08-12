package Handling_Frames;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selinum.WebElement;

public class FileUpload_pop_up {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("D:\\java\\eclipse\\java-selinum\\src\\test\\java\\Handling_Frames\\FILEUPLOAD.HTML");
	
	Thread.sleep(3000);

	
	org.openqa.selenium.WebElement resumeUpload = driver.findElement(By.cssSelector("input[type='file']"));
	resumeUpload.sendKeys("C:/Users/SAI/Downloads/Neelansh_Srivastav_FlowCV_Resume_2026-07-01.pdf");
	
	
	
	
	Thread.sleep(5000);
	driver.quit();
	
}
}
