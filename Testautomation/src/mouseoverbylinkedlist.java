import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverbylinkedlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.linkText("Registration")).click();
		
		
					




	}

}
