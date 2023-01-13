import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By)

	}

}
