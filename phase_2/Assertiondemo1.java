
package project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Assertiondemo1 {
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void getTitle() {
		String expectedTitle = "Your Store";
		String actualTitle = driver.getTitle();
		// assertion fail will work here 
		Assert.assertEquals(expectedTitle,actualTitle,"the title deos not match...");
	
	
	//assertTrue
	
	boolean searchbox = driver.findElement(By.name("search")).isDisplayed();
    
	
	
	
	//searchbox = false; //if we use this force fully fail
	//searchbox = false;
	
	
	//if searchbox is having True, then assert condtion passes

	//if searchbox is having false, then assert condition fails
	
	Assert.assertTrue(searchbox);
	
	driver.findElement(By.name("search")).sendKeys("mac");

	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
}
}


	


