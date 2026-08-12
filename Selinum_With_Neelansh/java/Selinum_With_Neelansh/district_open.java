package Selinum_With_Neelansh;

import org.openqa.selinum.WebDriver;

import Learning_Locator.ChromeDriver;

public class district_open {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.district.in/");
driver.wait();


}
}
