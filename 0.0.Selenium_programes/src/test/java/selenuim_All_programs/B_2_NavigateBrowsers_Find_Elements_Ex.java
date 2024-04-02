package selenuim_All_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_2_NavigateBrowsers_Find_Elements_Ex {

	public static void main(String[] args) 
	{
	    WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.google.com");
	    driver.navigate().refresh();
	    List<WebElement> link = driver.findElements(By.tagName("a"));
	    
	    	for (WebElement links : link)
	    	{
	    		System.out.println(links.getText());
	    		
			}
		
	    driver.navigate().back();
        driver.close();
        driver.quit();
	}

}
