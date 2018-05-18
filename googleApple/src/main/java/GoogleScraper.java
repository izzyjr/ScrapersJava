import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.PrintWriter;
import java.net.URLEncoder;

public class GoogleScraper {

    //URL: https://www.google.com/search?q=apple
    //Selector: H3.r a

    public static void main(String[] args) throws Exception{

        final String query = "apple";

        final org.jsoup.nodes.Document page = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(query,"UTF-8")).get();

//        System.out.println(page.outerHtml());

        final PrintWriter out = new PrintWriter("results.txt");


        for (Element searchResult: page.select("H3.r a")) {

            final String title = searchResult.text();
            final String url = searchResult.attr("href");

            out.write(title + " -> " + url + "\n");
        }

        out.close();
    }
}
