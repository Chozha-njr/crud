package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		// Open the date picker with the help of contains() function to find locator
		// auto click with software
        //datepicker id will change so usingpicker
		driver.findElement(By.xpath("//input[contains(@id,'picker')]")).click();
		
		Thread.sleep(3000);
		
		// Once the calendar opens, lets inspect the month and year and then print its
		// text on console
		// getText()
		
		String monthyear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		
		System.out.println(monthyear);//nov 2023
		
		// Split the string monthyear, we will get 2 new strings
		// and create an Array object that will store the string Month and Year.
		
		String my[] = monthyear.split(" ");//array to split output

		String month = my[0]; // November month
		String year = my[1]; // Year 2023

		System.out.println(month);
		System.out.println(year);
		
		while (!(month.equals("November") && year.equals("2024"))) {

			// click on the next button upto Nov. 2024

			driver.findElement(By.xpath("//span[text()='Next']")).click();

			String monthyear1 = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();

			month = monthyear1.split(" ")[0]; // November
			year = monthyear1.split(" ")[1]; // 2024
		}    
			
		    driver.findElement(By.xpath("//a[text()='30']")).click();//30 is date
		    
		    // driver.close();
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
