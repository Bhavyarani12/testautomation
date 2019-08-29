import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Masteringtestautomation {

	public static void main(String[] args) {
		  
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://testingworld.com");
		
		
		
		

	}

}
