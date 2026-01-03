package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraHome {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Initialize the webdriver
        ChromeDriver driver = new ChromeDriver();
       		
		//load the url
		driver.get("https://www.myntra.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags", Keys.ENTER);
		
		Thread.sleep(2000);
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//ul[@class='gender-list']//label[1]")).click();
		
		
		Thread.sleep(2000);
		
		//Under "Category" click "Laptop bags"
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[3]")).click();
		
			
		List<WebElement> items = driver.findElements(By.xpath("//input[contains(@value,'Laptop Bag')][1]"));
		System.out.println("Total no items found: " + items.size());
		
		
		
		//List<String> list = new ArrayList<String>();
		//int count = 0;
		
		/*for (WebElement each: items) 
		{
			count++;
		}//
		
		/**for(int i=0;i<items.size();i++)
		{
		//count++;	  
	    
	    }*/
		
		 //System.out.println(count);
		
		//Get the list of brand of the products displayed in the page and print the list.
		
	}	 
}
