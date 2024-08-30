import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testpages.eviltester.com/styled/index.html");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		//About
//		driver.findElement(By.linkText("About")).click();
//		driver.navigate().back();
		//Related sites
		driver.findElement(By.linkText("Related Sites")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("WebDriver Example Page")).click();
//		driver.findElement(By.cssSelector("#numentry")).sendKeys("9010486413");
//		//alert
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='show-as-alert']")));
//		driver.findElement(By.cssSelector("button[id='show-as-alert']")).click();
//		System.out.println("Alerts:"+driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		//para
//		driver.findElement(By.cssSelector("button[id='show-as-para']")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[data-locator='message-text']")));
//		System.out.println("Para:"+driver.findElement(By.cssSelector("p[data-locator='message-text']")).getText());
		
		
	}

}
