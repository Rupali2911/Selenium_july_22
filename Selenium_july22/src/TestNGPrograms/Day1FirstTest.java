package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1FirstTest {
		public WebDriver driver;
  @Test
  public void Rupali() {
	  System.out.println("Hi i am Devansh Patil");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
  }
}
