import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SileniumGuru {

    public static void main(String[] args) {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "/Users/israelmesa/Desktop/gecko_D/geckodriver");
        browser = new FirefoxDriver();
        browser.get("https://gol.caracoltv.com/");
        WebElement header = browser.findElement(By.id("site-header"));

//        browser.close();
    }
}
