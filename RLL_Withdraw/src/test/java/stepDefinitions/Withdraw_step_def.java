package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Withdraw_from_Account_Page;

public class Withdraw_step_def  {
	
	private final WebDriver driver;
	private final Withdraw_from_Account_Page Withdraw_Method ;
	
	
	
	public Withdraw_step_def() {
		driver = new FirefoxDriver();
		Withdraw_Method = new Withdraw_from_Account_Page(driver);
		SoftAssert s=new SoftAssert();
		
	}
	@Given("User navigates to the URL")
	public void user_navigates_to_the_url() {
		Withdraw_Method.navigateToURL("http://dbankdemo.com/bank/login"); //url 
		
	}

	@When("User performs the login process")
	public void user_performs_the_login_process() {   //id , pass
		try {
			Withdraw_Method.performLogin("kirans@gmail.com", "Kiran4301@S");
        } catch (Exception ex) {
            Assert.fail("Unable to open browser");
        }
	}
	    

	@Then("User clicks on withdraw link")
	public void click_Withdraw() {
		try {
			Withdraw_Method.clickWithdrawLink();
        } catch (Exception ex) {
            Assert.fail("Unable to click the link");
        }
		Withdraw_Method.clickWithdrawLink();
		
		
	}
	
	@Then("check RestButton")
	public void select_Retest_Button() {
		try {
			Withdraw_Method.clickWithdrawLink();
			Withdraw_Method.clickselectaccount();
			Withdraw_Method.clickonReset();
        } catch (Exception ex) {
            Assert.fail("unable to rest the page");
        }
		
		
	}
		
	@Then("select DropDown button and test")
	public void select_DropDown_button() {
		try {
			Withdraw_Method.clickselectaccount();
        } catch (Exception ex) {
            Assert.fail("Unable to click drop down button and select bank");
        }
		
	}
	
	@Then("check withdraw with no value in input")
	public void empty_Input_amount() {
		try {
			Withdraw_Method.clickselectaccount();
			Withdraw_Method.withdrawcheck("");
        } catch (Exception ex) {
            Assert.fail("please put valid amount for withdraw");
        }
	}
	
    
	@Then("check withdraw with invalid amount {string}")
	public void invalid_input(String amount) {
		try {
            String[] errorXPaths = {
                    "//span[contains(text(),'The withdraw amount ($0.00) must be greater than $')]", 
                    "//span[contains(text(),'The withdraw amount ($1000000000000000.00) is grea')]", 
                    "//div[@id='errorMessageBox3']/span"
            };
            String firstErrorMessage = null;

            for (String errorXPath : errorXPaths) {
                By errorLocator = By.xpath(errorXPath);

                try {
                    WebElement errorMessageElement = driver.findElement(errorLocator);

                    if (errorMessageElement.isDisplayed()) {
                        // Capture the first error message and break the loop
                        firstErrorMessage = errorMessageElement.getText();
                        throw new AssertionError("Error: " + firstErrorMessage);
                    }
                } catch (org.openqa.selenium.NoSuchElementException e) {
                    // Handle the case when the element is not found (error message not displayed)
                    
                }
            }

            // If no error message is displayed, you can run specific code
            if (firstErrorMessage == null) {
                System.out.println("No error message displayed. Running additional code...");
            } else {
                // If an error message is displayed, perform an assertion
                Assert.fail("Error: " + firstErrorMessage);
            }

            // Perform additional actions or verifications
            // ...

        } catch (AssertionError e) {
            // Handle the assertion error
        	
            System.out.println("Assertion failed: " + e.getMessage());
        }
	}
	@Then("give valid amount and deposite")
	public void Withdraw_Amount_from_account() {
		try {
			Withdraw_Method.clickselectaccount();
			Withdraw_Method.withdrawcheck("120");
        } catch (Exception ex) {
            Assert.fail("please put valid amount for withdrawa");
        }

        
		driver.close();
}
	
}

	/*try {
	            String[] errorXPaths = {
	                    "//span[contains(text(),'The withdraw amount ($0.00) must be greater than $')]", 
	                    "//span[contains(text(),'The withdraw amount ($1000000000000000.00) is grea')]", 
	                    "//div[@id='errorMessageBox3']/span"
	            };
	            String firstErrorMessage = null;

	            for (String errorXPath : errorXPaths) {
	                By errorLocator = By.xpath(errorXPath);

	                try {
	                    WebElement errorMessageElement = driver.findElement(errorLocator);

	                    if (errorMessageElement.isDisplayed()) {
	                        // Capture the first error message and break the loop
	                        firstErrorMessage = errorMessageElement.getText();
	                        throw new AssertionError("Error: " + firstErrorMessage);
	                    }
	                } catch (org.openqa.selenium.NoSuchElementException e) {
	                    // Handle the case when the element is not found (error message not displayed)
	                    
	                }
	            }

	            // If no error message is displayed, you can run specific code
	            if (firstErrorMessage == null) {
	                System.out.println("No error message displayed. Running additional code...");
	            } else {
	                // If an error message is displayed, perform an assertion
	                Assert.fail("Error: " + firstErrorMessage);
	            }

	            // Perform additional actions or verifications
	            // ...

	        } catch (AssertionError e) {
	            // Handle the assertion error
	        	
	            System.out.println("Assertion failed: " + e.getMessage());
	        }
	}*/
    		
