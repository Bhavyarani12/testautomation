import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).build().perform();
		
		
		
		
		
		
		

	}

}


				