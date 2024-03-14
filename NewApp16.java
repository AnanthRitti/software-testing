import java.time.Duration; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
public class App16 { 
public static void main(String[] args) { 
WebDriver driver=new ChromeDriver(); 
driver.get("https://www.facebook.com/"); 
new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//button[contains(@id , 'u_0_5_')]"))).click(); 
} 
}