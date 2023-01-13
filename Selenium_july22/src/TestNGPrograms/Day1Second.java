package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1Second {
	public WebDriver driver;
	
  @Test
  public void launchTest() {
	  driver = new ChromeDriver();
	  	driver.get("https://www.facebook.com");	  	
  }
  @Test
  public void loginTest() {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yogrupatil@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Devansh@181213");
	  driver.findElement(By.tagName("button")).click();
  }
  
  
}
