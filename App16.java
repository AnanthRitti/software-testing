import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App16 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://store.steampowered.com/news/");

        // Wait for the dynamic element to be clickable
        WebElement filterElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'eventcalendar_FilterSettings')]/div[contains(., 'Options and Filters')]")));

        // Click on the dynamic element
        filterElement.click();

        // Close the browser
        driver.quit();
    }
}
