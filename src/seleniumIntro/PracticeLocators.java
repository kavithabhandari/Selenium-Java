package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "kavitha";
		
		WebDriver driver = new ChromeDriver();

		tryLogin(driver, name);
		String password = getPasssword(driver); // Method to get Password
		Thread.sleep(2000);
		login(driver, name, password); // Method to insert password to login

	}
	public static void tryLogin(WebDriver driver, CharSequence name) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); // automatically types given username
		driver.findElement(By.name("inputPassword")).sendKeys("password"); // automatically types given password
		driver.findElement(By.className("signInBtn")).click(); // it will click on sign button and submit it
		Thread.sleep(1000);

		
	}

	// Extract password from Text
	public static String getPasssword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText = driver.findElement(By.cssSelector("form p")).getText();

		// Please use temporary password 'rahulshettyacademy' to Login.is the default
		// password message
		// spilt the password from the sentence

		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		System.out.println(password);

		return password;

	}

	// Login with new password
	public static void login(WebDriver driver, CharSequence name, CharSequence password) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Login Frame
		driver.findElement(By.id("inputUsername")).sendKeys(name); // automatically types given username
		driver.findElement(By.name("inputPassword")).sendKeys(password); // automatically types given password
		driver.findElement(By.className("signInBtn")).click(); // it will click on sign button and submit it
//		driver.close();
	}

}
