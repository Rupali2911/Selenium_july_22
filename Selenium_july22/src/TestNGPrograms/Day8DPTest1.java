package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8DPTest1 {
	public WebDriver driver;
  @Test(dataProvider = "FBLogin",dataProviderClass = Day8DPTest2.class) 
  public void FaceBookLogin(String username, String password) {
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys(username);
	  PassWord.sendKeys(password);
	  LoginBtn.click();
  }
}
