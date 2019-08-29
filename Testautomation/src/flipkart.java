import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkart {
	static WebDriver driver;
	
	@BeforeTest
	

	public static void startbrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://www.flipkart.com");
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	public void TestCases() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		               
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Women')]"))).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9876543218");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("avbfd");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(1000);
		
	}
	
	@AfterTest() 
		public void close() 
		{
		
		
		driver.close();
		
		
		
		
		
				
				
		
		
		
		
		
		

	}

}
