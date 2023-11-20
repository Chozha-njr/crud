package redbusProject.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import redbusProject.Base.TestBase;
public class AccountPageTest extends TestBase {

	Homepage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new Homepage(driver);
	}

	@Test
	public void clickOnSignUpPage() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOnMyAccount();
		Thread.sleep(5000);
		hp.clickOnSignup();
		Thread.sleep(5000);
		

	}



	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

}