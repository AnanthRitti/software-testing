import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class App17 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\aec_project\\Aec_project\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement pickElement=driver.findElement(By.id("uploadfile_0"));
        pickElement.sendKeys("C:\\aec_project\\Aec_project\\src\\Screenshot 2024-02-02 102538.png");
        driver.findElement(By.name("terms")).click();
        driver.findElement(By.name("send")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}