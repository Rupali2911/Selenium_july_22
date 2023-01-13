import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribut {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://utkarshaaacademy.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/div[2]/div/nav/ul/li[5]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[1]/div/form/div/div[1]/div[1]/input")).sendKeys("Devansh");
		
		driver.findElement(By.xpath("//input[@id='name-lastname']")).sendKeys("Patil");
		
		driver.findElement(By.xpath("//input[@name='field-phone[value]']")).sendKeys("7020053130");
		
		driver.findElement(By.xpath("//input[@class='coblocks-field coblocks-field--email']")).sendKeys("yogruppatil@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05-12-2022");
		
		driver.findElement(By.xpath("//input[@id='time-morning']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='special-notes']")).sendKeys("i want to cannect 2pm for mock");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
