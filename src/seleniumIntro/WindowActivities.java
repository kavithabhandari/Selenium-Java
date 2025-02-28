package seleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); //to maximize the window while  program is running use maximize
		
		driver.get("https://google.com");
		
		driver.navigate().to ("https://rahulshettyacademy.com/locatorspractice/"); //to navigate from one window to another while website is automated
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
	}

}
