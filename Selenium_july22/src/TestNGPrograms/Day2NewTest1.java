package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2NewTest1 {
	public WebDriver driver;
  @Test
  public void launchBrowser() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
}
