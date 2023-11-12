package seleniumscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWithJavaScriptExecutor {

		public static void drawborder(WebElement element, WebDriver driver) {

			JavascriptExecutor js = ((JavascriptExecutor) driver);

			// arguments[0].style.border='3px solid red'

			js.executeScript("arguments[0].style.border='3px solid yellow'", element);
			
		}
		
		public static void main(String[] args) throws IOException {

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.opera.com/download");

			//// span[contains(text(),'Accept cookies')]

			WebElement e1 = driver.findElement(By.xpath("//span[contains(text(),'Accept cookies')]"));

			drawborder(e1, driver);

			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destFile = new File("./Screenshot_javascript/Acceptcookies.png");

			FileUtils.copyFile(srcFile, destFile);

			driver.close();
		

	}

}
