package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
   		
		//load the url
		driver.get("https://www.amazon.in/");
			
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		
		
	    List<WebElement> findelements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
	    List<Integer> list = new ArrayList<Integer>();//after below iteration,we need to store the items in the list, so this line is used. 
	    
	    for (WebElement each : findelements) 
	    {
			String text = each.getText(); //getting the text 
		    String replaceAll = text.replaceAll("," ,"");//replace the comma with the empty string and storing it in variable
		    if(!replaceAll.isEmpty()) //if replaceall is empty, 
		    {
			int mobiles = Integer.parseInt(replaceAll);//converting string to integer and storing it in variable
			list.add(mobiles);
			}
	    }
	           Collections.sort(list);//sorting the list (i.e mobile price is sorted with the least price)
	           System.out.println(list);
	}}
	    
	
	
	    
		
		//WebElement ele = driver.findElement(By.class("a-price"));
		//ele.click();
		//System.out.println("ele");
		

	


