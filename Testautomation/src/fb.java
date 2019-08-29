import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb {
	
	public class FB_Annotations {
		WebDriver driver;
		@BeforeTest
		public void startbrowser() throws IOException, InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver= new ChromeDriver();

		 driver.get("http://fb.com/");
		 Thread.sleep(1000); 
		}

		 @Test(priority=0)
		 public void testCase1() {
			 
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123anam");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);

		 }

		 @AfterTest
		 
		public void quit() {
		 driver.quit();

		}
		 }
		

}
