package Learning_Collection;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Method {
	
//	private static final String x = ();
	private static int width;

	public static void main(String[]args, Object weight, Object height, int y) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://instagram.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		driver.manage().window().setSize(new Dimension( width, (int) height));
		driver.manage().window().getPosition();
	driver.manage().window().setPosition(new Point( (int) width , (int) y));
		
		driver.close();
	//	driver.quit();
	}}

