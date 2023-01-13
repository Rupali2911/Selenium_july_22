import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchDemo {

	public static void main(String[] args) throws InterruptedException  {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		//static wait provided by java
		//Thread.sleep(2000);
		//Dynamic wait provided by selenium implicit wait
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicity Wait provided by Selenium
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Devansh");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('welcome to Facebook')");
		
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Devansh");
		

	}

}

