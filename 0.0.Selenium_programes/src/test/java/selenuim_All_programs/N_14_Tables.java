package selenuim_All_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N_14_Tables {

	public static void main(String[] args) 
	{
		//Tables are two types one select 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//td[.='Maria Anders']/preceding::input[@type='checkbox']")).click();

	}

}
