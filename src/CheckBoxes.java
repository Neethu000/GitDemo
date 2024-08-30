import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

// check boxes
// If check box is selected print true or else print false 
		// false
		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());
		driver.findElement(By.id("checkBoxOption3")).click();
		// true
		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());

//count the number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//Alerts		
		String text = "Rahul";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        
//switch() method
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
        
		
		
	}

}
