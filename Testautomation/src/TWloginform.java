import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TWloginform {
	static WebDriver driver;

	@BeforeTest
	

	public static void startbrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe"); 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://selenium-vinod.blogspot.com");
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	public void testcases() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'08_Practice Site')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='sel_1']")).sendKeys("bhavya");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//textarea[@name='middle_Name']")).sendKeys("rani");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//input[@id='sel_2']")).sendKeys("100");
		Thread.sleep(1000);
	}
		
		@Test(priority=1)
		public void testcases1() throws InterruptedException
		{
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		}
		
		@Test(priority=2)
		public void testcases2() throws InterruptedException 
		{
		
		
		
		
		driver.findElement(By.xpath("//input[@id='sel_3']")).sendKeys("100");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[1]//input[5]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body//input[8]")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		
		
		
		driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@name='language']/option[3]")).click();
		Thread.sleep(1000);
		
		}
		

		JavascriptExecutor js11=(JavascriptExecutor)driver;
		js11.executeScript("window.scrollBy(0,1000)");
		
		
		
		
		
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='FileUpload']"));
		upload.sendKeys("E:\\Screenshot\\screen.jpeg");
		Thread.sleep(1000);
		
	}
	
	@AfterTest
	public void close()
	{
		
		driver.close();
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		

	}


