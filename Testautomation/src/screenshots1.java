import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class screenshots1 {
	WebDriver driver;
	
	@BeforeTest
	public void startbrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver= new ChromeDriver();
		   
driver.manage().window().maximize();
driver.get("https://www.fb.com");
	}
	@Test(priority=0)
	public void Testcases() throws InterruptedException, IOException 
	{
	
TakesScreenshot ts=(TakesScreenshot)driver;
File file=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("D:\\Screenshot\\screen.jpeg"));
Thread.sleep(2000);
System.out.println("Saved the screenshot");

	}

@AfterTest
public void close() 
{
	
driver.close();

}
}
