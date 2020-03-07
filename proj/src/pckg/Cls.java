package pckg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Cls {
	

	
  @Test(dataProvider = "LoginCredentials")
  public void Tc1(String uid, String pd) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("http://apps.qaplanet.in/hrm/login.php");
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(uid);
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pd);
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
  }

  @DataProvider
  public Object[][] LoginCredentials() {
	  Object[][] cred=new Object[4][2];
	  
	  cred[0][0]="qaplanet1";
	  cred[0][1]="lab1";
	  
	  cred[1][0]="qaplanet1";
	  cred[1][1]="lab";
   
  
	  cred[2][0]="qaplanet";
	  cred[2][1]="lab1";
  
	  cred[3][0]="qaplanet";
	  cred[3][1]="lab";
	  
	  
	  
	  return cred;
  
  
  
  
  }
  
  
}
