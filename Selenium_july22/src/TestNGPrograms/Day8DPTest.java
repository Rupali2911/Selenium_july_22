package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Day8DPTest {
	public WebDriver driver;
  @Test(dataProvider = "FBLogin")
  public void FaceBookLogin(String username, String password) {
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys(username);
	  PassWord.sendKeys(password);
	  LoginBtn.click();
	  Reporter.log("Successfully Enter username and password and click on login button",true);
  }

  @DataProvider
  public Object[][] FBLogin() {
    return new Object[][] {
      new Object[] { "yogruppatil@gmail.com" ,"Devansh181213"},
      new Object[] { "yogruppatil@yahoo.com" ,"Dev181213" },
      new Object[] { "YogrupPatil@gmail.com" ,"Devansh1812" },
      new Object[] { "yogrup@gmail.com" ,"Devansh@181213" },
    };
  }
}
