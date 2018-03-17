import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest extends TestCase{
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/xhtml");
        Thread.sleep(5000); //Let the user actually see something;
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Pixar");
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}