package selenuim_All_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_8_WindowHandles {

	public static void main(String[] args) throws Throwable 
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();
       driver.get("https://gmail.com");
       driver.findElement(By.linkText("Help")).click();
       String parenthandle = driver.getWindowHandle();
       Set<String> handles = driver.getWindowHandles();
      //1-Method
       for (String handle : handles) 
      {
          if(!handle.equals(parenthandle))
          {       	 
    	  driver.switchTo().window(handle);
          driver.findElement(By.linkText("Community")).click();    
          }
	  }
     
       Thread.sleep(4000);
       driver.switchTo().window(parenthandle);
       driver.findElement(By.id("identifierId")).sendKeys("chaitu");
   
       // 2-Method
       Object[] windows = handles.toArray();
       String window1 = windows[0].toString();
       String window2 = windows[1].toString();
       driver.switchTo().window(window2);
       driver.findElement(By.linkText("Community")).click();    
       driver.switchTo().window(window1);
       driver.findElement(By.id("identifierId")).clear();
       driver.findElement(By.id("identifierId")).sendKeys("chaitanya");
	}

}
