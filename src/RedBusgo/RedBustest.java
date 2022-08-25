package RedBusgo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBustest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		String month ="Sept 2022";
	    String date ="15";
		
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@class='db']")).sendKeys("Visakhapatnam");
		Thread.sleep(4000);
		List<WebElement> l=driver.findElements(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/input"));
	    for(int i=0;i<l.size();i++)    
	     {
	    if(l.get(i).getText().equalsIgnoreCase("RTC Complex, Visakhapatnam"))
	          {
	        	  l.get(i).click();
	          }
	 	  }
		
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Ongole");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
        
        while(true)
		{
			 if(driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[2]")).getText().contains(month))
			 {
				 break;
			 }
			 else
			 {
				 driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[1]/td[3]")).click();
			 }
			 }
        
        	Thread.sleep(5000);
        	
    		List<WebElement> li = driver.findElements(By.xpath("//td[@class='wd day']"));
    		
    		for(int i =0; i<li.size();i++)
    		 {
    			 
    			 if(li.get(i).getText().equalsIgnoreCase(date))
    			 {
    				 li.get(i).click();
                 }
    			 }
    		
    		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/button")).click();
    		
    		Thread.sleep(2000);
    	    JavascriptExecutor a=(JavascriptExecutor)driver;
    		a.executeScript("window.scrollBy(0,100)");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//div[text()='Got It']")).click();
    		driver.findElement(By.xpath("//div[@class='button']")).click();
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		}}
       


