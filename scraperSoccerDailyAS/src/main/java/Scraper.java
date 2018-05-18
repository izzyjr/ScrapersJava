import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Scraper {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://en.as.com/en/");

        driver.findElement(By.xpath("/html/body/header/div/div[1]/ul/li[6]/a/span")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"buscador-menu\"]"));

        element.sendKeys("Lionel Messi");

        element.submit();

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/ul/li[3]/button")).click();

        System.out.println(driver.getTitle());

        List<WebElement> link = driver.findElements(By.className("titular-articulo"));
        List<WebElement> summary = driver.findElements(By.className("txt"));
        List<WebElement> date = driver.findElements(By.className("fecha"));

        for (int i = 0; i < link.size(); i++) {
            System.out.println("============= News Article =========================");
            System.out.println(date.get(i).getText() +
                    "\n" + link.get(i).getText() + ": " +
                    "\n" + summary.get(i).getText());
        }

        driver.quit();
    }
}
