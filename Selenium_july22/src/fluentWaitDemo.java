import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitDemo {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		WebElement colorChangeBtn = driver.findElement(By.xpath("//button[@id='colorChange']"));
		
		WebElement enableAfterBtn = driver.findElement(By.xpath("//button[@id='enableAfter']"));
		
		System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
		
		System.out.println("Before Visible After Button Shown color as"+colorChangeBtn.getCssValue("Color"));
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		WebElement VisibleAfterBtn = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		
		System.out.println("Visible After Button is displayed after 5 second"+VisibleAfterBtn.isDisplayed());
		
		System.out.println("Before button get enable"+enableAfterBtn.isEnabled());
		
		System.out.println("Before Visible After Button Shown color as"+colorChangeBtn.getCssValue("Color"));
		
	}
	

}
