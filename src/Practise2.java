import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		//user name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Priya");
		//pswd
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Priya.1");
		//comment box
		driver.findElement(By.cssSelector("textarea[name='comments']")).clear();
		driver.findElement(By.cssSelector("textarea[name='comments']")).sendKeys("good");
		//check box count
		System.out.println(driver.findElements(By.cssSelector("input[name='checkboxes[]']")).size());
		//driver.findElement(By.cssSelector("input[value='cb3']")).click();
		//selected check box true or false printed in console
		System.out.println(driver.findElement(By.cssSelector("input[value='cb3']")).isSelected());
		//radio button
        //driver.findElement(By.cssSelector("input[value='rd2']")).click();
		//selected radio button true or false printed in console
        System.out.println(driver.findElement(By.cssSelector("input[value='rd2']")).isSelected());
        //static dropdown
        WebElement staticdropdown = driver.findElement(By.cssSelector("select[name='dropdown']"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       
	}

}
