import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://www.amazon.com");
		Thread.sleep(1000);
		
		driver.close();
		

	}

}
