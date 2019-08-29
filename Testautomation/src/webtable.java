import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webtable {
	WebDriver driver;
	
	@BeforeTest
	public void startbrowser() throws InterruptedException
		 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	public void Testcases() 
	{
		
		
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		

		for(int i=2; i<=7; i++) 
		{
			String  actualXpath = beforeXpath+i+afterXpath;
			
		
		 WebElement element=driver.findElement(By.xpath(actualXpath));
		 System.out.println(element.getText());
		}
		 
		 
		 
	}
	

	@AfterTest
	
	
	public void quit() { 
		
		 driver.quit();

	}
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		


