package selenuim_All_programs;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_9_ScreenShort_OutPut {

	public static void main(String[] args) throws Throwable 
	{
		
		 WebDriver driver = new ChromeDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     driver.get("https://the-internet.herokuapp.com/");
	     driver.findElement(By.linkText("Context Menu")).click();
	     
	     TakesScreenshot ts = (TakesScreenshot)driver; //tackesScreenshot is Interface
	     File souresfile = ts.getScreenshotAs(OutputType.FILE);
	     File deasFile = new File("D:\\ScreenShortsParctice\\output.png");
	     FileUtils.copyFile(souresfile, deasFile);
	    
	     //BYTES
	     byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
	     File desfile = new File("D:\\ScreenShortsParctice\\byteoutput.png");
	     FileOutputStream fo = new FileOutputStream(desfile);
	     fo.write(bytes);
	     fo.close();
	     
	     //BASE64 
	      String base64code = ts.getScreenshotAs(OutputType.BASE64);
	      byte[] byteArr = Base64.getDecoder().decode(base64code);
	      File destFile = new File("D:\\ScreenShortsParctice\\base64output.png"); 
	      FileOutputStream fos = new FileOutputStream(destFile);
	      fos.write(byteArr);
	      fos.close();
	      System.out.println("Screenshrot saved successfully");
	      driver.close();
	}

}
