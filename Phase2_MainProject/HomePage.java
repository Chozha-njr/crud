package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class HomePage {
	@FindBy(xpath = "//span[text()='Buy Now']")
	public static WebElement buyNow;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
// driver can now work with your elements and methods of this class
	}

	public String get_homepage_title() throws InterruptedException {
		String title = BaseTest.driver.getTitle();
		return title;
	}

	public void click_On_BuyNow() throws InterruptedException {
		Thread.sleep(2000);
		buyNow.click();
	}
}