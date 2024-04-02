package selenuim_All_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class J_10_implicit_Explicit_PageLoad_Times {

	public static void main(String[] args) 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
      
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.manage().window().setSize(new Dimension(1000, 1000));
      driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
      driver.findElement(By.id("alertBox")).click();
      
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
      wait.until(ExpectedConditions.alertIsPresent());
      driver.switchTo().alert().accept();
      driver.close();      
      
	}

}
