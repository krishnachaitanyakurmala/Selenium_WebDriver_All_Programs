package selenuim_All_programs;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
        
	    WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element : cols)
			{
//				String dt=;
				
//				if(element.getText().equals(dt))
				{
					element.click();
					break;
				}
			}	
		}

	}
	
}
