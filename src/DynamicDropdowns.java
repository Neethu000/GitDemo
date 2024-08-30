import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://spicejet.com");
		
		//Radio buttons
		//driver.findElement(By.xpath("(//*[name()='circle'])[3]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[10]")).click();
		//Family and Friends
	    driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[17]")).click();

        //Dynamic DropDown  
	    driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'][1]")).click();        
//	    driver.findElement(By.xpath("//div[contains(text(),'Hyderabad')]")).click();
//	    driver.findElement(By.xpath("//div[contains(text(),'Goa (Dabolim)')]")).click();
	    
        // Parent to Child Xpath
	    driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'Goa (Dabolim)')]")).click();
	    driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'Hyderabad')]")).click();
	    
	    // Calendar
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-27']")).click();
	    
	    		
	}

}
