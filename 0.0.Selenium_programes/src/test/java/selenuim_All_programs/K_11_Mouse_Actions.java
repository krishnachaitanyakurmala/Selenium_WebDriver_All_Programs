package selenuim_All_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class K_11_Mouse_Actions {

	public static void main(String[] args) 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	  Actions act = new Actions(driver); //Actions is class
	  act.moveToElement(driver.findElement(By.linkText("Selenium Practice"))).perform();
	  act.moveToElement(driver.findElement(By.linkText("Waits Practice"))).click().perform();
	}

}
