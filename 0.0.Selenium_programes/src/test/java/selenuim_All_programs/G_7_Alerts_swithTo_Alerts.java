package selenuim_All_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_7_Alerts_swithTo_Alerts {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
	 
		driver.findElement(By.id("confirmBox")).click();		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promptBox")).click();		
		driver.switchTo().alert().sendKeys("chaitu");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}	
}
