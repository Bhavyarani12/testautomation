import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		Thread.sleep(1000);
		
		
		driver.close();
		
		
		
				
		
		

	}

}
