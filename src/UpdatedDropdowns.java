import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("http:google.com");
		driver.navigate().to("http://spicejet.com");
        
        // Select One Currency using For each loop
        // click on currency drop down 
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).click();
	Thread.sleep(2000);
	
	//Group or List of currency elements
    List<WebElement> currencyList = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
	// Iterate through the options and select the desired one
	String currencyText = "USD";
	for (WebElement option : currencyList) 
	{
	  if (option.getText().equals(currencyText)) 
	{
	option.click();
	break; // Break the loop once the desired option is selected
	}
  }
	        
 // Select One Currency using For loop
	
   /*
    * String desiredOptionText = "USD";
	* 
    * // Use a for loop with an index for iteration through options 
    * for (int i = 0;i <optionElements.size(); i++) 
    * { 
    * WebElement option = optionElements.get(i);
	* if (option.getText().equals(desiredOptionText)) 
	* { 
	* option.click(); 
	* break; // Break the loop once the desired option is selected 
	* } }
	*/
	 
 //Printing List of Currency GetText()
			
			/*
			 * driver.findElement(By.
			 * xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).
			 * click(); List<WebElement> optionElement = driver.findElements(By.
			 * xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"
			 * ));
			 * 
			 * for (int i = 0; i < optionElement.size(); i++) { // Get the current option
			 * using the index WebElement option = optionElement.get(i);
			 * 
			 * // Print the text of the current option (you can perform other actions as
			 * needed) System.out.println("Option " + (i + 1) + ": " + option.getText());
			 * Thread.sleep(1000); }
			 */
		    
//  // Adult DropDown 
//  driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
//  //Before Print
//  System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
//  // While Loop    
//   int j =1;
//   while(j<4)
//    {
//     driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
//	   j++;
//    }
//  // click on Done Button
//  driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
//  //Print After select DropDown
//  System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
	
  
      }
	}

