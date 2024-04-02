package selenuim_All_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class F_6_iframe_SamePage_multipleFramesWork {

	public static void main(String[] args) throws Throwable 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
      driver.findElement(By.id("name")).sendKeys("Chaitu");
      driver.switchTo().frame("frm1");
      Thread.sleep(3000);
      
      Select menu = new Select(driver.findElement(By.id("selectnav1")));
      menu.selectByVisibleText("- Java");
      driver.switchTo().defaultContent();
      Thread.sleep(3000);
      
      driver.findElement(By.id("name")).clear();
      driver.findElement(By.id("name")).sendKeys("Chaitanya");
      Thread.sleep(3000);
      
      driver.switchTo().frame("frm2");
      driver.findElement(By.name("fName")).sendKeys("chaitanya");
      Thread.sleep(3000);
      
      driver.switchTo().defaultContent();
      driver.switchTo().frame("frm1");     
      Select courseName = new Select(driver.findElement(By.id("course")));
      courseName.selectByVisibleText("Dot Net");
      Thread.sleep(3000);
      
      driver.switchTo().defaultContent();
      driver.findElement(By.id("name")).clear();
      driver.findElement(By.id("name")).sendKeys("kurmala");
      
	}

}
