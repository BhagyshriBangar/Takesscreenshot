package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		//Step 1		
		WebDriverManager.chromedriver().setup();
		//Step 2
		
		WebDriver driver  = new ChromeDriver();
		
		//Step 3
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(5000);
		
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(S1);
		
		File S2 = new File("/Users/ranjeetkendre/Desktop/28OCt_Screenshot/Demo12.jpg");
		
		File S3 = new File("/Users/ranjeetkendre/Desktop/28OCt_Screenshot/DemoTest.jpg");

        FileHandler.copy(S1, S3);
        
        FileHandler.copy(S1, S2);
        
        driver.close();
	}

}
