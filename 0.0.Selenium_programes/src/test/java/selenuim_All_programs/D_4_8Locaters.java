package selenuim_All_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_4_8Locaters {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com");		
		driver.findElement(By.name("email")).sendKeys("kurmalakrishnachaitanya@gmail.com");
		driver.findElement(By.xpath("//input[@name ='password' and @class ='form-control']")).sendKeys("Chaitu20@",Keys.ENTER);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.findElement(By.id("search-date")).click();
		driver.findElement(By.className("radio_b")).click();
		driver.findElement(By.tagName("input")).isDisplayed();
		driver.findElement(By.linkText("WelcomeChaitanya")).click();
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.cssSelector("#name")).sendKeys("chaitanya");
		driver.close();
		
	}

}
