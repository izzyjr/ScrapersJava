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

        //Row

        String xpathRow = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]";

        List<WebElement> tableRows = driver.findElements(By.xpath(xpathRow));

        //Symbol

        String xpathSymbol = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[1]";

        List<WebElement> symbol = driver.findElements(By.xpath(xpathSymbol));

        //Name

        String xpathName = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[2]";

        List<WebElement> name = driver.findElements(By.xpath(xpathName));

        //Price

        String xpathPrice = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[3]";

        List<WebElement> price = driver.findElements(By.xpath(xpathPrice));

        //Percent Change

        String xpathPercentChange = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[5]";

        List<WebElement> percentChange = driver.findElements(By.xpath(xpathPercentChange));

        //Market Cap

        String xpathMarketCap = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[6]";

        List <WebElement> marketCap = driver.findElements(By.xpath(xpathMarketCap));

        //Volume in Currency(24hr)

        String xpathVolumeCurrency = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[8]";

        List <WebElement> volumeCurrency = driver.findElements(By.xpath(xpathVolumeCurrency));

        //Circulating Supply

        String xpathCirculatingSupply = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]/td[10]";

        List<WebElement> circulatingSupply = driver.findElements(By.xpath(xpathCirculatingSupply));

        int size = symbol.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ": " + symbol.get(i).getText() +
                                          " - " + name.get(i).getText() +
                                          " - " + price.get(i).getText() +
                                          " - (" + percentChange.get(i).getText() + ")" +
                                          " - " + marketCap.get(i).getText() +
                                          " - " + volumeCurrency.get(i).getText() +
                                          " - " + circulatingSupply.get(i).getText() + "\n");
        }

        driver.quit();
    }
}
