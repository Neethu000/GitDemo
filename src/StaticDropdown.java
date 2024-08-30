import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		//Dropdown with select tag is static
//		WebElement staticDropdown= driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
//		Select dropdown= new Select(staticDropdown);
//		dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		//first name
		driver.findElement(By.cssSelector("input[id='firstname']")).sendKeys("Priya");
		//last name
		driver.findElement(By.cssSelector("input[id='surname']")).sendKeys("Allamallamallam");
		//age
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("29");
		//notes
		driver.findElement(By.cssSelector("textarea[id='notes']")).sendKeys("hello");
		//country
		WebElement staticdropdown =driver.findElement(By.cssSelector("select[id='country']"));
	    Select dropdown = new Select(staticdropdown );
	    dropdown.selectByIndex(5);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("India");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("Australia");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    //submit
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	    
	}

}
