package redbusProject.Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import redbusProject.Base.TestBase;

public class bookBusTicketTest extends TestBase {
	 SearchBusPage Sp;
	 @BeforeClass
	public void OpenApp() {
		openBrowser("Chrome");
		Sp = new SearchBusPage(driver);
	}
	@Test
	public void SearchBus() throws InterruptedException {
		String from = "Mumbai";
		String to = "Pune";
		
		Sp.clickFrom(from);
		Sp.clickTo(to);
		Sp.clickDate();
		Sp.selectDateFromCalendar();
		Sp.searchBuses();
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void CloseApp() {

		driver.quit();
	}
}