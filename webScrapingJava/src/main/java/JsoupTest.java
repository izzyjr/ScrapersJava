

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupTest {

    public static void main(String[] args) throws IOException {

        //Downloads the HTML from wikipedia and parses it
        final Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        log(doc.title());

        //Selects a bunch of a tags
        final Elements newsHeadlines = doc.select("#mp-itn b a");

        //Print to console
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s",
                    headline.attr("title"), headline.absUrl("href"));
        }

        //Print the outer HTML of the page
//        System.out.println(doc.outerHtml());


    }
    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }

}
