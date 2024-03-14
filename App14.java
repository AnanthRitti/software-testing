import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class App14 { 
public static void main(String[] args)throws Exception { 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritti\\aec_project\\Aec_project\\src\\driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver(); 
 driver.manage().window().maximize(); 
 driver.get("https://www.hyrtutorials.com/p/basic-controls.html"); 
 driver.findElement(By.id("firstName")).sendKeys("abcd"); 
 driver.findElement(By.id("password")).sendKeys("ananth"); 
 driver.findElement(By.id("email")).sendKeys("abanjskhcd"); 
 driver.findElement(By.id("femalerb")).click(); 
 driver.findElement(By.id("englishchbx")).click(); 
 driver.findElement(By.id("hindichbx")).click(); 
 driver.findElement(By.id("registerbtn")).click(); 
 Thread.sleep(2000); 
 driver.findElement(By.linkText("Click here to navigate to the home page")).click(); 
 driver.quit(); 
 } }