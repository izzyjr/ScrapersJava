import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChromeDriver {

    public static void main(String[] args) {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");
        browser = new org.openqa.selenium.chrome.ChromeDriver();
        browser.get("https://gol.caracoltv.com/");
        WebElement header = browser.findElement(By.id("site-header"));

//        browser.close();
    }
}
