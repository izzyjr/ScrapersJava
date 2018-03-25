import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class fifaScraper {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://en.as.com/en/");

        driver.findElement(By.xpath("/html/body/header/div/div[1]/ul/li[6]/a/span")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"buscador-menu\"]"));

        element.sendKeys("Messi");

        element.submit();

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/ul/li[3]/button")).click();

        System.out.println("Page title is: " + driver.getTitle());

        List<WebElement> link = driver.findElements(By.xpath("/html/body/div[6]/div[2]/div[1]/div[3]/section/article[1]/div[1]/h1/a"));
        List<WebElement> summary = driver.findElements(By.xpath("/html/body/div[6]/div[2]/div[1]/div[3]/section/article[1]/div[1]/p"));
        List<WebElement> date = driver.findElements(By.xpath("/html/body/div[6]/div[2]/div[1]/div[3]/section/article[1]/div[1]/div/div[1]/p/time/a/span[1]"));

        for (int j = 0; j < link.size(); j++) {
            System.out.println( link.get(j).getText() + " - " +
                    "\n" + summary.get(j).getText() +
                    "\n" + date.get(j).getText()) ;
        }

        driver.quit();

    }
}




















//    WebElement elementSearch = driver.findElement(By.xpath("/html/body/header/div[3]/div/div[4]/div/div/div/form/input"));
//
//        elementSearch.sendKeys("Lionel Messi");
//
//                elementSearch.submit();
//
//                System.out.println("Page title is: " + driver.getTitle());
//
//                List<WebElement> link = driver.findElements(By.xpath("//*[@id=\"search-all\"]/section/div[2]/div/div/div/div/div/div[2]/div/a/h3"));
//        List<WebElement> summary = driver.findElements(By.xpath("//*[@id=\"search-all\"]/section/div[2]/div/div/div/div/div/div[1]/div/p"));
//
//        System.out.println(" =============== Fifa Articles by Player ================= ");
//        for (int j = 0; j < link.size(); j++) {
//        System.out.println( link.get(j).getText() + ": " +
//        '\n' + summary.get(j).getText() ) ;
//        }

