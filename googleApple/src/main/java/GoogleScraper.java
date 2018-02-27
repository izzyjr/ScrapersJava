import org.jsoup.Jsoup;

import java.net.URLEncoder;

public class GoogleScraper {

    //URL: https://www.google.com/search?q=apple
    //Selector: H3.r a

    public static void main(String[] args) throws Exception{

        final String query = "apple";

        final org.jsoup.nodes.Document page = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(query,"UTF-8")).get();

        System.out.println(page.outerHtml());
    }
}
