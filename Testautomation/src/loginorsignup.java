import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginorsignup {
	static WebDriver driver;
	
	@BeforeTest
	

	public static void startbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe"); 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	public void Testcases() throws InterruptedException {
		
		driver.get("https://thetestingworld.com/testings/");
		Thread.sleep(1000);
		
	
		
		driver.findElement(By.xpath("//input[@placeholder='myusername']")).sendKeys("abc");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='myusername@gmail.com']")).sendKeys("rani@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys("123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12.12.1997");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("12345");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("dfers");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body//input[10]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@name='sex']")).sendKeys("Female");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='countryId']")).sendKeys("Albania");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='stateId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='cityId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Zip code']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[1]//div[1]//form[1]//div[1]//input[2]")).click();
		Thread.sleep(1000);
		
}

@AfterTest

public void close() 
{
		
		driver.close();
	}
	
}
				

		
		

	


