package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) 
	{
		//Initialize the webdriver
        ChromeDriver driver = new ChromeDriver();
       		
		//load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");//switching to frame
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();//xpath of the Try it button
		
		driver.switchTo().alert().accept();//accept the alert
		
		//driver.switchTo().alert().dismiss();//
		
		String result = driver.findElement(By.id("demo")).getText();//confirm the action is performed correctly by verifying the text displayed 
		System.out.println(result);
		
		//String message = "OK";
		
		if(result.contains("OK"))
	      {
	    	  System.out.println("Alert accepted successfully");
	    	  
	      }
	      else if (result.contains("Cancel"))
	      {
	    	  System.out.println("Alert dismissed successfully");
	    	  
	      }
	     else {
	    	  System.out.println("Unexpected alert");
	      }
		
		
		
		


	}

}
