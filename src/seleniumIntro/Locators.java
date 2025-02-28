package seleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Kavitha";
		String password = "rahulshettyacadeemy";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//using id,name,className
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click(); //click is used for click action after we signin or submit

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000); // to wait for milli seconds to pause script for one second before going to next question
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kavitha");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kavitha@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//clear is used to clear the text previous one to enter other one
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kavithabhandari@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9868435341");  //parent-child in xpath
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();    
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //parent-child in css selector
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //parent-child in xpath
		
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Kavitha");  //we can use hash(#) if we have id name for css 
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  //css using regular expression
	
		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		driver.close();//
		
	}
}
//<label for="chkboxOne"> Remember my username</label>