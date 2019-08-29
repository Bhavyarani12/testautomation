import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TMS {
 static WebDriver driver;
	
	@BeforeTest

	public static void startbrowser() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(1000);		
}
	
	@Test(priority=0)
	
		public void Testcases() throws InterruptedException {
		
		driver.get("http://www.phptravels.net/admin/");
		Thread.sleep(1000);
		
		//TMS Login
			
		driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
		
		//Tours
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		
		
		//Tours
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		
		//Spectacular Of The Nil 3 Nights
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(1000);
		
		
		//MetaInfo
		
        driver.findElement(By.xpath("//input[@placeholder='Meta title']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("tourmetatitle")).sendKeys("acv");
		Thread.sleep(1000);
		
		driver.findElement(By.name("tourkeywords")).sendKeys("acdwdwd");
		Thread.sleep(1000);
		
		driver.findElement(By.name("tourmetadesc")).sendKeys("ascvfgvrtvrf");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='update']")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest

	
	 public void close() 
	{
		
		
		
		
		
		driver.close();
		
	}
}
