package seleniumWebpageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click(); //code for dropdown
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //before looping output print
		
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click(); //choose number of adults
			i++;
			
		}
	
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //output printed after looping

		
		driver.findElement(By.id("btnclosepaxoption")).click(); //to click done
		
		
	}

}
