package redbusProject.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import redbusProject.Base.TestBase;
import redbusProject.Base.Homepage;


public class NavigateTest extends TestBase {

	Homepage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new Homepage(driver);
	}

	@Test(priority = '1')
	public void clickOnAccount() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOnMyAccount();
		Thread.sleep(2000);
		
	}

	@Test(priority = '2')
	public void clickOncabrental() throws InterruptedException {

		hp.clickOnCabRental();
		Thread.sleep(3000);
	}

	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

}
