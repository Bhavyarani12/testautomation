import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	

public class screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\Screenshot\\screen.jpeg"));
		Thread.sleep(1000);
			
		System.out.println("Saved the screenshot");
		driver.close();
		
		

	}
}
