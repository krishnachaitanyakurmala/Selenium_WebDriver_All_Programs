package selenuim_All_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_1_OpenBrowserEx1 {

	public static void main(String[] args)
	{
	    	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    driver.close();
	}

}
