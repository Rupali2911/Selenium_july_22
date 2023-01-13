package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day5BaseTest {
	public WebDriver driver;
  @Test
  public void openBrowser() {
	  driver = new ChromeDriver();
	  System.out.println("This Will execute First(Open Browser)");
  }
}
