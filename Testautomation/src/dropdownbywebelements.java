
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbywebelements {


		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
		    driver.manage().window().maximize();
			driver.get("https://www.fb.com");
			
			
			driver.findElement(By.id("day")).click();
			WebElement searchDropdownBox=driver.findElement(By.id("day"));
			Select item=new Select(searchDropdownBox);
			item.selectByValue("10");
			Thread.sleep(1000);
		    
			
			driver.findElement(By.id("month")).click();
			WebElement searchDropdownBox1=driver.findElement(By.id("month"));
	        Select item1=new Select(searchDropdownBox1);
			item1.selectByValue("3");
			Thread.sleep(1000);
			
            driver.findElement(By.id("year")).click();
            WebElement searchDropdownBox11=driver.findElement(By.id("year"));
			Select item11=new Select(searchDropdownBox11);
			item11.selectByValue("1995");
			Thread.sleep(1000);
			
			driver.close();
	
			
			

	}

		
		

}
