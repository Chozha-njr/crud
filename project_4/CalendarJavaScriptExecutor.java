package seleniumscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
        
		
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("document.getElementById('onward_cal').value='11/12/2024'");
        
		Thread.sleep(5000);  // to show execution slowly
		
		driver.close();
		
	
	
	
	
	}

}
