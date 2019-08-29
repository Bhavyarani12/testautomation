import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownindex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://facebook.com");	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id='day']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='day']/option[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='month']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='month']/option[Jan]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("////select[@id='year']")).click();
		Thread.sleep(1000);
		
		driver.close();
	}


}