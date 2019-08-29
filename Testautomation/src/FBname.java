import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBname {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("http://facebook.com");
			Thread.sleep(1000);
		
			driver.findElement(By.name("firstname")).sendKeys("bhavya");
			Thread.sleep(1000);
			
			driver.findElement(By.name("lastname")).sendKeys("hosamani");
			Thread.sleep(1000);
			
			driver.findElement(By.name("reg_email__")).sendKeys("1234");
			Thread.sleep(1000);
			
			driver.findElement(By.name("reg_passwd__")).sendKeys("absdf");
			Thread.sleep(1000);
			
		driver.close();

	}

}
