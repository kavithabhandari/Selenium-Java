package seleniumWebpageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //for dropdown select
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); // FROM city code
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click(); // To city code using index to go and select city from second  dropdown
		
	}

}
