package Initlize_days;

import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Code {

	public static void main(String[]args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		String title= driver.getTitle();
		System.out.println(title);
		String url=getCurrenturl();
		System.out.println(url);
		//driver.quit();
	//	
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		driver.quit();
	}

	private static String getCurrenturl() {
		// TODO Auto-generated method stub
		return null;
		

	}	
		
	}

