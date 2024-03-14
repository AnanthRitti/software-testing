
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App_login {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ritti\\aec_project\\Aec_project\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        WebElement usernametb=driver.findElement(By.name("username"));
        usernametb.sendKeys("1nt21cs028");
        WebElement passtb=driver.findElement(By.name("password"));
        passtb.sendKeys("Ananth.2003");
        WebElement nextButton=driver.findElement(By.id("loginbtn"));
        nextButton.click();
        Thread.sleep(10000);    
        driver.quit();
        }
}
  