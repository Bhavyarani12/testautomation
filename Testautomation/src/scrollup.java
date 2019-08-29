import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://facebook.com");
		Thread.sleep(1000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(2500,-2500)");
		System.out.println("scrolled up");
		Thread.sleep(1000);
	}
	
}
		
	
		
		

		
		
