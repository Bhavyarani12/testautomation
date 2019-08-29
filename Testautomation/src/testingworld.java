
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testingworld {
	WebDriver driver;
	
	@BeforeTest
	
	

	public void Startbrowser() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe"); 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://thetestingworld.com");
		Thread.sleep(1000);
		

	}
	
	@Test(priority=0)
	public void Testcase()  throws IOException, InterruptedException{
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'VIDEOS')]"))).build().perform();
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_name']")).sendKeys("bhavya");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_username']")).sendKeys("dswe");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_password1']")).sendKeys("123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_password2']")).sendKeys("345");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_email1']")).sendKeys("bhavya@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_email2']")).sendKeys("bhavya@gmail1.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='validate']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Quick Demo')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='wdform_1_element_first2']")).sendKeys("abc");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='wdform_1_element_last2']")).sendKeys("avbg");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='wdform_2_element2']")).sendKeys("rani123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='wdform_4_element2']")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='wdform_10_element2']")).sendKeys("12.12.90");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//select[@id='wdform_5_element2']/option[02]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='button-submit']")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void close()
	{
		
	driver.close();
		
	}
		
		
		
		


	}


