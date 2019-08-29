import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("http://jqueryui.com/droppable");
	    Thread.sleep(1000);
	    
	    driver.switchTo().frame(0);
	    Actions action = new Actions(driver);
	    
	    action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
	    
	   
	    
	}

}
