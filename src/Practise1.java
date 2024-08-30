import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//     	driver.get("https://testpages.eviltester.com/styled/challenges/hard-selectors.html");
//		driver.findElement(By.cssSelector("button[id='select.me.by.id']")).click();
//		System.out.println(driver.findElement(By.id("select.me.by.idstatus")).getText());
		
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		//click on alert box button
		driver.findElement(By.xpath(" //input[@onclick='show_alert()']")).click();
		//getting text from alert box
		System.out.println(driver.switchTo().alert().getText());
		//switch to() method: give accept()method means click ok in alert box
		driver.switchTo().alert().accept();
		//after clicking ok some text displaying that text xpath 
		driver.findElement(By.xpath("(//p[@class='inline-explanation'])[1]")).getText();
		//the text printing in console
		System.out.println(driver.findElement(By.xpath("(//p[@class='inline-explanation'])[1]")).getText());
		
		
		
	}
	

}
