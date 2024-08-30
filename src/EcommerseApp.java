import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait A = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Mushroom","Carrot"};
		
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		A.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit wait
		A.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
}

     public static void addItems(WebDriver driver,String[]itemsNeeded)
     {
    	int j=0; 
     List<WebElement> products =driver.findElements(By.xpath("//h4[@class='product-name']"));
    
for(int i=0;i<products.size();i++)
{
	String[] name = products.get(i).getText().split("-");
	String formatedName = name[0].trim();
	
	//format it to get actual vegetable name
	//convert array into array list for easy search
	//check whether name you extracted is present in array list or not
	
	
	List itemneededlist =Arrays.asList(itemsNeeded);
	
	if(itemneededlist.contains(formatedName))
	{
		j++;
		//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)
		{
			break;
		}
	}
{
	
}
	
}
	}}

