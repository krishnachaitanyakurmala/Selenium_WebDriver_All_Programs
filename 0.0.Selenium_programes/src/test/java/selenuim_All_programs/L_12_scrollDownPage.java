package selenuim_All_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_12_scrollDownPage {

	public static void main(String[] args)
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.get("https://www.hyrtutorials.com/");
      WebElement element = driver.findElement(By.className("pagecurrent"));
      JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView()",element);
	}

}
