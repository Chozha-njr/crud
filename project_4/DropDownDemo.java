package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		WebElement e1 = driver.findElement(By.xpath("//select[@name='coffee']"));
		
		// Selecting the drop down and to perform action on it, we need too create object or select class in selinium
		
		Select dd = new Select(e1);
		dd.selectByIndex(4);// 0,1,2,3,4 = different value in scroll down
		Thread.sleep(2000);
		dd.selectByValue("regular"); //search by by id value
		
		Thread.sleep(2000);
		dd.selectByVisibleText("With cream");
		
		//get all the option from the dropdown andstore in list
		
		List<WebElement> li = dd.getOptions();
		
		System.out.println("the size of the list : " + li.size());  
		
		//print all the value of the dropdown
		
		for(WebElement l: li) {
			System.out.println(l.getText());
		}
		
		
	}

}
