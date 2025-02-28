package seleniumWebpageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //isSelcted() is to check if the check box has been selected or not

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // senior citizen check box
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count the number of check boxes
		System.out.println((driver.findElements(By.cssSelector("input[type='checkbox']")).size()));
		
		
		
		
	
	}

}
