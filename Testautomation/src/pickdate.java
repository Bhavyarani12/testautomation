import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pickdate {
	 static WebDriver driver;
	
	
	@BeforeTest

	public static void startbrowser() throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe"); 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://thetestingworld.com");
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	
	public void Testcases() throws InterruptedException 
	{
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Quick Demo')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='wdform_10_button2']")).click();
		 Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[7]//tbody[1]//tr[3]//td[4]")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void close()
	{
		
		
		driver.close();
	}

}
