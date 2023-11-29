package JunitTesting;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class SearchEngine {

    @Test
    public void testGoogleSearch() {
        

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google search page
        driver.get("https://www.google.com");

        // Find the search input field and search button
        WebElement searchField = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.id("APjFqb"));

        // Enter your search query
        searchField.sendKeys("Tester");

        // Click the search button
        searchButton.click();

        // Wait for the search results page (replace with appropriate waiting mechanism)

        // Assert that the search results are displayed (replace with appropriate verification)
        assertFalse(driver.getTitle().contains("Tester"), "Google search failed");

        // Close the browser
        driver.quit();
    }
}

