package seleniumscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCheckbox {
	//checkbox and radio button

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		//click the colour button in the website softwarely 
		driver.findElements(By.xpath("//input[@name='color']")).get(1).click();
		driver.findElements(By.xpath("//input[@name='color']")).get(2).click();
		driver.findElements(By.xpath("//input[@name='color']")).get(5).click();
		
		////click the browser button in the website softwarely 
		driver.findElements(By.xpath("//input[@name='browser']")).get(1).click();
		driver.findElements(By.xpath("//input[@name='browser']")).get(2).click();

        
		
		
		
		
		
		
		
		
		
		
	}

}
