package RedBusgo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBustest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String month ="Aug";
		String date ="15";
		
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/input")).sendKeys("Rama Talkies, Visakhapatnam");
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Ongole");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//input[@class='db'])[3]")).click();
        
        
        while(true)
		{
			 if(driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[2]")).getText().contains(month))
			 {
				 break;
			 }
			 else
			 {
				 driver.findElement(By.xpath( "//div[@class='rb-calendar']/table/tbody/tr[1]/td[3]")).click();
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
    			  }}


