import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		
		driver.manage().window().maximize();
		
		//css Selector with parent child relationship
		
		driver.findElement(By.cssSelector("div.theme-menu>nav>ul>li>a.nav-link[title='Automation Practice']")).click();
		
		//driver.findElement(By.cssSelector("input[id=name-firstname]")).sendKeys("Devansh");
		
		//driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Devansh");
		
		//driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Patil");
		
		//driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Patil");
		
		//driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("7020053130");
		
			//driver.findElement(By.cssSelector("input[id^='ph']")).sendKeys("7020053130");
		
		driver.findElement(By.cssSelector("input[id$='ne']")).sendKeys("7588001548");
		
		//driver.findElement(By.cssSelector("button[class='wp-block-button__link']")).click();
		
			//css selector with combinations
		
		//driver.findElement(By.cssSelector("input.coblocks-field--email#email")).sendKeys("yogruppatil@gmail.com");
		
			//css selector with other attribute
		
		//driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("yogruppatil@gmail.com");
		
			//driver.get("https://www.facebook.com");
		
		//driver.findElement(By.cssSelector("div._6ltg>button")).click();
		
		//driver.get("https://demoqa.com/select-menu");
		
	//	driver.findElement(By.cssSelector("select>option:nth-of-type(6)")).click();
		
	//	driver.findElement(By.cssSelector("div#withOptGroup>div>div.css-1hwfws3")).click();
		
	//	driver.findElement(By.cssSelector("div#withOptGroup>div>div>div.css-1uccc91-singleValue")).click();
		
		
		
	}

}
