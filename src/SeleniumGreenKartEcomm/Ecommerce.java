package SeleniumGreenKartEcomm;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Musk Melon", "Pumpkin" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name")); // 30 elements present

		for (int i = 0; i < products.size(); i++) // 30 times iteration happens

		{
			// brocolli-1kg to spilt by hyphen we use split method it gives broccoli, 1kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();// trim used to remove white spaces

			// covert array into array list for dynamic search
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeededList.size()) {
					break;
				}
			}
		}
	}
}
