import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCantain {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com/");
		
		driver.manage().window().maximize();
		//Xpath Cantains
		driver.findElement(By.xpath("//nav//a[@title='Automation Practice']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'first')]")).sendKeys("Devansh");
		//driver.findElement(By.xpath("//input[contains(@class,'last')]")).sendKeys("Patil");
		//driver.findElement(By.xpath("//input[contains(@id,'phone')]")).sendKeys("7020053130");
		//driver.findElement(By.xpath("//input[contains(@name,'field-email[value]')]")).sendKeys("yogruppatil@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@class,'date')]")).sendKeys("06-12-2022");
		//driver.findElement(By.xpath("//input[contains(@id,'afternoon')]")).click();
		//driver.findElement(By.xpath("//textarea[contains(@id,'notes')]")).sendKeys("I want to connect 2 pm for mock");
		//driver.findElement(By.xpath("//button[contains(@class,'button__link')]")).click();
		
		//Xpath Starts 
		
		driver.findElement(By.xpath("//input[starts-with(@id,'name-fir')]")).sendKeys("Devansh");
		driver.findElement(By.xpath("//input[starts-with(@id,'name-lastn')]")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[starts-with(@name,'field-phone[value]')]")).sendKeys("7020053130");
		driver.findElement(By.xpath("//input[starts-with(@class,'coblocks-field coblocks-field--e')]")).sendKeys("yogruppatil@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@type,'date')]")).sendKeys("08-12-2022");
		driver.findElement(By.xpath("//input[starts-with(@id,'time-m')]")).click();
		driver.findElement(By.xpath("//textarea[starts-with(@id,'s')]")).sendKeys("I want to connect 10 am for mock");
		driver.findElement(By.xpath("//button[starts-with(@type,'s')]")).click();

	}

}
