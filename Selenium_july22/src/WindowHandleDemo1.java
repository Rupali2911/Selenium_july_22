import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String>ChildWindow = driver.getWindowHandles();
		
		for(String childwindow : ChildWindow ) {
			if(!MainWindow.equals(childwindow)) {
			driver.switchTo().window(childwindow);
			String headingTest = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
			System.out.println(headingTest);
			}
			
		}
		
		
		
		

	}

}
