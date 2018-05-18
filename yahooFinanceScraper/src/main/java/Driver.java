import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Driver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://finance.yahoo.com/cryptocurrencies?count=120");

        System.out.println(driver.getTitle());

//        List<WebElement> symbol = driver.findElements(By.xpath("//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[2]/a"));
//
//        for (int i = 0; i < symbol.size(); i++) {
//            System.out.println(i + ": " + symbol.get(i).getText());
//        }
        String xpath = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]";
        List<WebElement> tableRows = driver.findElements(By.xpath(xpath));

        for (int i = 0; i < 112; i++) {
            System.out.println((i + 1) + ": " + tableRows.get(i).getText());
        }

        driver.quit();
    }
}
