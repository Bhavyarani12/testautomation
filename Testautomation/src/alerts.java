import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("53920");		
		 Thread.sleep(5000);
       driver.findElement(By.name("submit")).submit();
       
       Thread.sleep(1000);
       
       driver.switchTo().alert().accept();
       driver.switchTo().alert().dismiss();
       
       
       		
		
		

	}

}
