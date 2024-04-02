package selenuim_All_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_3_Caputure_Of_getTitle_getCurrentUrl {

	public static void main(String[] args) 
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://flights.qedgetech.com");
       String pgt = driver.getTitle();
       String pgurl = driver.getCurrentUrl();
       System.out.println(pgt);
       System.out.println(pgurl);
       driver.close();
	}

}
