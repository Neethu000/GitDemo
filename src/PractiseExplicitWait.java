import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait S = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//user name
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		//pswd
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		//radio btn
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
	
		
		S.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.cssSelector("select[class='form-control']")).click();
		WebElement options=driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(options); 
		dropdown.selectByValue("consult");
		S.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#signInBtn")));
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
		
	}

}
