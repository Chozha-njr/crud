BaseTest.java
package base;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
      public static WebDriver driver = new ChromeDriver();
      @AfterAll
      public void Close_Browser() throws InterruptedException 
           { System.out.println("Browser closed");
           driver.close();

      }
}