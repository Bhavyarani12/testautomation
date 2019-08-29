import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tooltip {
	static WebDriver driver;
	 @BeforeTest
	 

	public static void startbrowser() throws InterruptedException 
	{
	
	
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(1000);
		
	}
	 
	 @Test(priority=0)
	 public void Testcases()
	 {
	 
	 
		
		String tooltip=driver.findElement(By.xpath("//li[@id='menu_documentation']//a[contains(text(),'Documentation')]")).getAttribute("title");
		System.out.println("Tooltip is=" +tooltip);
		
	 }
	 
	 @AfterTest
	 public void close()
	 {
	 driver.close();
	 }
	 
		
		
		
	
		
		

	}


