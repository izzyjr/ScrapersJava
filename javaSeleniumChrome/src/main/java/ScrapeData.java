import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ScrapeData {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");

        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = new ChromeDriver();

        // And now use this to visit denvycom.com
        driver.get("http://denvycom.com/blog/");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the Denvycom search input element by its name
        WebElement element = driver.findElement(By.id("s"));

        // Enter something to search for
        element.sendKeys("research");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        // Should see: "All Articles on Denvycom related to the Keyword "Research"

        //Get the title of all posts
        List<WebElement> titles = driver.findElements(By.cssSelector("h2.page-header"));
        List<WebElement> dates = driver.findElements(By.cssSelector("span.entry-date"));
        System.out.println(" =============== Denvycom Articles on Research ================= ");
        for (int j = 0; j < titles.size(); j++) {
            System.out.println( dates.get(j).getText() + " - " + titles.get(j).getText() ) ;
        }

        //Close the browser
        driver.quit();
    }
}
