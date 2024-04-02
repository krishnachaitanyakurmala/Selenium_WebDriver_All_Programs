package selenuim_All_programs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_5_DropDown_Select {

	public static void main(String[] args) throws Throwable 
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
      WebElement dropelement = driver.findElement(By.id("searchDropdownBox"));
      dropelement.click();
       Select dropDownList = new Select(dropelement);
       
       dropDownList.selectByIndex(2);
       Thread.sleep(3000);
       
       Select dropDownvisableTest = new Select(dropelement);
       dropDownvisableTest.selectByVisibleText("Amazon Fashion");
       Thread.sleep(3000);
       
       Select dropDownvalue = new Select(dropelement);
       dropDownvalue.selectByValue("search-alias=mobile-apps");
       
       List<WebElement> allcat =  dropDownList.getOptions();
  
       System.out.println(allcat.size());
       for (WebElement element : allcat) 
       {
		  System.out.println(element.getText());
	   }
       driver.close();
	}

}
