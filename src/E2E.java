import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://spicejet.com");
		
//Radio buttons
		// Round trip
		//driver.findElement(By.xpath("(//*[name()='circle'])[3]")).click();
		// One way
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
	 	driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-28']")).click();	    
	    
// Select One Currency using For each loop
// click on currency drop down 
	    driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).click();
	    Thread.sleep(3000);
//Group or List of currency elements
        List<WebElement> currencyList = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
//Iterate through the options and select the desired one
	    String currencyText = "USD";
	    for (WebElement option : currencyList) 
	    {
	    if (option.getText().equals(currencyText)) 
	    {
	    option.click();
	    break; // Break the loop once the desired option is selected  
    }}
	    
//Adult DropDown 
	   driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
//Before Print
	   //System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
//While Loop    
	   int j =1;
	   while(j<4)
	   {
	   driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
	   j++;
	    }
//click on Done Button
	   driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
//Print After select DropDown
	  //System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
		
//Search button
	   driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();

//Popup check box and Continue button   
       driver.findElement(By.xpath("//*[name()='rect' and contains(@width,'100%')]")).click();
	   Thread.sleep(3000);
	   //driver.findElement(By.xpath("(//*[@fill-rule='evenodd'])[9]")).click();
	   driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
	   
	  
	}
}
