package pckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossb {
	WebDriver dd;
	 @Parameters("browser")
	@Test
	 
	  public void CrB(String ibr) {
		if (ibr.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	        dd=new FirefoxDriver();
	        System.out.println("running with FF");
		}
		else if(ibr.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			dd=new ChromeDriver();
			System.out.println("running with chrome");
		}
		
		dd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		dd.get("http://apps.qaplanet.in/hrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    dd.findElement(By.name("txtPassword")).sendKeys("lab1");
	    dd.findElement(By.name("Submit")).click();
	    
	 
	    
	    Assert.assertEquals(dd.getTitle(), "OrangeHRM");
	    
	    
	  
		dd.close();
  }
}
