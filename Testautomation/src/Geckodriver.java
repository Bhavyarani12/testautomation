import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodriver {

		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.gecko.driver", "?C:\\Users\\Nxt\\git\\Test_Automation\\Test Automation\\geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
			     
			 driver.manage().window().maximize();
			 driver.get("https://facebook.com");	
			Thread.sleep(1000);
			
			}
		

	}


