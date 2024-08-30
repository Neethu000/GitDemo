import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommercseApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		
		List<WebElement> products =driver.findElements(By.xpath("//h4[@class='product-name']"));
		//System.out.println(products);
		
		// In products list select cucumber 
		for(int i=0;i<products.size();i++)
			{
			String name = products.get(i).getText();
			
			if(name.contains("Cucumber"))
			{
				//click on add cart
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					break;
				}
			}
	}


}
