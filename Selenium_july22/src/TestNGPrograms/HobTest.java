package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class HobTest {
	public WebDriver driver;
  @Test(dataProvider = "HobbyCenter")
  public void HobbySignUp(String email,String FirstName, String LastName, String Age, String City, String State, String PinCode) {
	  driver = new ChromeDriver();
	  driver.get("http://123.252.129.5:8080/hob");
	  WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	  WebElement Firstname = driver.findElement(By.xpath("//input[@name='name']"));
	  WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	  WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
	  WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	  WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
	  WebElement pin = driver.findElement(By.xpath("//input[@name='pin']"));
	  WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
	  Email.sendKeys(email);
	  Firstname.sendKeys(FirstName);
	  lastname.sendKeys(LastName);
	  age.sendKeys(Age);
	  city.sendKeys(City);
	  state.sendKeys(State);
	  pin.sendKeys(PinCode);
	  submit.click();
	 };

  @DataProvider
  public Object[][] HobbyCenter() {
    return new Object[][] {
      new Object[] { "yogruppatil@gmail.com","Rupali","Patil","34","pune","Maharashtra","411062"},
      new Object[] {"devansh@gmail.com","Yogesh","patil","38","dhule","maharashtra","401107"},
    };
  }
}
