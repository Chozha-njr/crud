package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocator {

	public static void main(String[] args) {
		//step : 1 open the browser
		// use ctrl + shift + o command to import required packages
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// enter the url
		
	    driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		
        //inspect the username using id  locator and check if textbox is present or not
	    
	    boolean Displayed= driver.findElement(By.id("wpName2")).isDisplayed();
	    System.out.println("Element is Displayes ?" + Displayed);
	    
	    boolean enabled= driver.findElement(By.id("wpName2")).isEnabled();
	    System.out.println("Element is Enabled ?" + enabled); 
	    
	    //enter text in user name
	    
	    //driver.findElement(By.id("wpName2")).sendKeys("demouser");
	    //by css selector 
	    driver.findElement(By.cssSelector("#wpName2")).sendKeys("demouserwithcss");
	    // enter text in password
	    
	    WebElement password = driver.findElement(By.id("wpPassword2"));
	    
	    Displayed = password.isDisplayed();
	    System.out.println("Element password is displayd ?"+ Displayed);
	    
	    enabled = password.isEnabled();
	    System.out.println("Element password is displayd ?"+ enabled);
	    
	    password.sendKeys("admin@1234");
	    
	    WebElement retypepassword = driver.findElement(By.id("wpRetype"));
	    
	    retypepassword.sendKeys("admin@1234");
	    
        WebElement Email = driver.findElement(By.id("wpEmail"));
	    
	    Email.sendKeys("admin@gmail.com");
	    
	    
	    // navigate to redbus
	    driver.navigate().to("https://www.redbus.in/");
	    
	    
	    //write mumbai name in from in redbus
	    //driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("Mumbai");
	    //above working another eg css selector 
	    //cssSelector if u get id put # in first = #firstname
	    driver.findElement(By.cssSelector("#src")).sendKeys("Mumbai");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
