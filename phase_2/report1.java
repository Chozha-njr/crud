package project_1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class report1 {
	@Test
	public void extentDemo() {
		//create an object to initiate Extend report engine
		
		ExtentReports ex = new ExtentReports();
		
		//give path copy from properties in phase 2 selenium test NG
		
		ExtentSparkReporter sparkrepoter =new ExtentSparkReporter("C:\\Users\\chozha\\Sl_SeleniumDemo_workspace\\ATE-phase2-Selenium-TestNG\\extendReport\\report.html");
		
		ex.attachReporter(sparkrepoter);
		
		ex.flush();
		
		
	}
	@Test
	public void extentDemo2() throws IOException {
		//create an object to initiate Extend report engine
		
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		
		ExtentSparkReporter sparkrepoter =new ExtentSparkReporter(file);
		
		ex.attachReporter(sparkrepoter);
		
		ex.flush();
		
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}
	
}
