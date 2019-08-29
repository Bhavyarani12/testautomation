import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://amazon.com");
		Thread.sleep(1000);
		
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);
		
		driver.close();


	}

	}


