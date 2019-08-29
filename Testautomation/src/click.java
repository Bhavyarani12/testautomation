import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

final class click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://gmail.com");
		Thread.sleep(1000);
		
		driver.findElement( By.xpath("//span[@class='NlWrkb snByac']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
		Thread.sleep(1000);

		driver.close();
		
		
		
		
		

	}

}
