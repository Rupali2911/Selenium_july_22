package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4priorityTest {
	public WebDriver driver;
	String pageTitle = "Utkarshaa Academy";
  @Test 
  public void Starting_point() {
	  driver =new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
  }
  @Test (priority =1)
  public void checkTitle() {
	  		String ActualTitle = driver.getTitle();
	  		Assert.assertEquals(ActualTitle, pageTitle);
	  		System.out.println("Test Pass");  		
  }
  @Test (priority =2)
  public void clickonElement() { 
	  driver.findElement(By.xpath("//nav//a[text()='Automation Practice']")).click();
	  System.out.println(driver.getCurrentUrl());
  }
  @Test (priority =3)
  public void insert_data() {
	  	
	  driver.findElement(By.xpath("//nav//a[text()='Automation Practice']")).click();
	  	driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Devansh");
	  	driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Patil");
	  	driver.findElement(By.cssSelector("input[id^='ph']")).sendKeys("7020053130");
	  	driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("yogruppatil@gmail.com");
  }
}
