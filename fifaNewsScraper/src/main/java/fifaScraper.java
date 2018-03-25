import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifaScraper {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.fifa.com/");

//        WebElement elementSearch = driver.findElement(By.xpath("/html/body/header/div[3]/div/div[4]/div/div/div/form/input"));
//
//        elementSearch.sendKeys("Lionel Messi");
//
//        elementSearch.submit();

        System.out.println("Page title is: " + driver.getTitle());

//        List<WebElement> link = driver.findElements(By.xpath("//*[@id=\"search-all\"]/section/div[2]/div/div/div/div/div/div[2]/div/a/h3"));
//        List<WebElement> summary = driver.findElements(By.xpath("//*[@id=\"search-all\"]/section/div[2]/div/div/div/div/div/div[1]/div/p"));
//
////        System.out.println(" =============== Denvycom Articles on Research ================= ");
////        for (int j = 0; j < link.size(); j++) {
////            System.out.println( link.get(j).getText() + ": " +
////                    '\n' + summary.get(j).getText() ) ;
////        }

        driver.quit();

    }
}
