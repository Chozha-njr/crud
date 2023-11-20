package project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {
	
	@Test(priority='1',groups={"smoke","functional","regression"})
	public void wikiPage1() {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		driver.close();
	}
	@Test(priority='2',groups={"functional"})
	public void wikiPage2() {
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
			
			driver.close();
		
	}
	@Test(priority='3',groups={"smoke"})
	public void ninjaPage1() {
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			
			driver.close();
	}
	@Test(priority='4',groups={"functional","regression"})
	public void ninjaPage2() {
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			
			driver.close();
	}		
}
