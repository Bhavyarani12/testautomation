import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBid
{


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("http://facebook.com");
			Thread.sleep(1000);
		
			driver.findElement(By.id("u_0_l")).sendKeys("bhavya");
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_n")).sendKeys("hosamani");
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_q")).sendKeys("1234");
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_x")).sendKeys("absdf");
			Thread.sleep(1000);
			
		driver.close();

	}

}