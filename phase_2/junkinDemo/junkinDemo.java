package com.app.jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJenkinsDemo {
	
	@Test
	public void GetTitle() // Called as a Test Method
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}