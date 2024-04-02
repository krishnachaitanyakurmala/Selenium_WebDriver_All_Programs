package selenuim_All_programs;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_13_calendar {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
          
        String targetdate = "20 mar 2023";
        Calendar calendar = Calendar.getInstance();
        try 
        {
		  SimpleDateFormat targetdataformet = new SimpleDateFormat("dd MMM yyyy");
		  targetdataformet.setLenient(false);
		  Date date = targetdataformet.parse(targetdate);
		  calendar.setTime(date);
        } catch (Exception e) 
        {
			throw new Exception("Invalid date is provided, please check the input date!!");
		}
		  int targetmonth = calendar.get(Calendar.MONTH);
		  int targetyear = calendar.get(Calendar.YEAR);
		  int targetday = calendar.get(Calendar.DAY_OF_MONTH);
		
	      driver.findElement(By.id("first_date_picker")).click();
	   // month year Format
	      String currentdate = driver.findElement(By.className("ui-datepicker-title")).getText();	
		  calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
		  int currenttmonth = calendar.get(Calendar.MONTH);
		  int currentyear = calendar.get(Calendar.YEAR);
          
		  while (currenttmonth < targetmonth || currentyear <targetyear) 
		  {
			  driver.findElement(By.className("ui-datepicker-next")).click();
			  currentdate = driver.findElement(By.className("ui-datepicker-title")).getText();	   
			  calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
			  currenttmonth = calendar.get(Calendar.MONTH);
			  currentyear = calendar.get(Calendar.YEAR);
		  }
		  
		 while (currenttmonth > targetmonth || currentyear > targetyear) 
		  {
			  driver.findElement(By.className("ui-datepicker-prev")).click();
			  currentdate = driver.findElement(By.className("ui-datepicker-title")).getText();	   
			  calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
			  currenttmonth = calendar.get(Calendar.MONTH);
			  currentyear = calendar.get(Calendar.YEAR);
		  }
	
		 if(currenttmonth == targetmonth && currentyear == targetyear ) 
		driver.findElement(By.xpath("//table[@class ='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+targetday+"]")).click();
		else            
		 throw new Exception("unable to select the date becasuse of current and target dates mismatch");
		driver.quit();
	}

}
