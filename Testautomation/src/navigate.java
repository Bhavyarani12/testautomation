import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.fb.com");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(7000);
		
		driver.navigate().back();
		Thread.sleep(7000);
		
		driver.navigate().forward();
		Thread.sleep(7000);
		
		driver.close();
		
		 }


	}


