import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bhavya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hosamani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("abc");
		Thread.sleep(1000);
		
		driver.close();
	}

}
