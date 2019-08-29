import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverbyclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.className("a-meter-animate"))).build().perform();
		Thread.sleep(1000);
		
		driver.close();
					

	




	}

}
