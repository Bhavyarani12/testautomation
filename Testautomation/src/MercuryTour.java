import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTour {
	 WebDriver driver;
	 
	@BeforeTest
	public void startbrowser() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		 
		 driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		 Thread.sleep(1000);
		 
	}
	
	@Test(priority=0)
	
	public void TC1() throws InterruptedException {

	 //Registration
		 
		 driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bhavya");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hosamani");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6739823456");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("bhavyahosamani89@gmail.com");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("vibhuti colony,gulbarga");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("kusnoor road,gulbarga");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("gulbarga");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("585106");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='country']/option[108]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhavyahosamani");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rani123");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("rani123");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='register']")).click();
		 Thread.sleep(1000);
		 
		 //Sign on
		 
		 driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bhavyahosamani");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rani123");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='login']")).click();
		 Thread.sleep(1000);

		 
		 driver.findElement(By.xpath("//body//b//input[2]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='passCount']/option[2]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='fromPort']/option[3]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='fromMonth']/option[2]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='fromDay']/option[2]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='toPort']/option[2]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='toMonth']/option[3]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='toDay']/option[23]")).click();
		 Thread.sleep(1000);

		 driver.findElement(By.xpath("//font[contains(text(),'Economy class')]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//select[@name='airline']/option[2]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		 Thread.sleep(1000);
	
		 
	}
	
	@AfterTest
	
	public void quit() {
		
		driver.close(); 
		 
		 
		 
	
		 
		 
		 
		 
				 
		 
		 
	}

}

