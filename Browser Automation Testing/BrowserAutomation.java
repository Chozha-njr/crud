package JunitTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class BrowserAutomation {

    @Test
    public void testFacebookAuthentication() {
        

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook login page
        driver.get("https://www.facebook.com");

        // Find username and password input fields and login button
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        // Enter your Facebook credentials (replace with your test account details)
        usernameField.sendKeys("demouser12345@gmail.com");
        passwordField.sendKeys("demoUser@1234567890");

        // Click the login button
        loginButton.click();

        // Wait for the authentication process (replace with appropriate waiting mechanism)

        // Assert that the login was successful (replace with appropriate verification)
        assertFalse(driver.getCurrentUrl().contains("facebook.com/home"), "Facebook authentication failed");

        // Close the browser
        driver.quit();
    }
}