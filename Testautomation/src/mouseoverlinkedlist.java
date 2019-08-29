import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class mouseoverlinkedlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
					
		//MouseHover functions
	   Actions action=new Actions(driver);
	   action.moveToElement(driver.findElement(By.linkText(".//*[@id='nav-link-accountList']"))).build().perform();
	   Thread.sleep(3000);
   
	   driver.close();



	}

}
