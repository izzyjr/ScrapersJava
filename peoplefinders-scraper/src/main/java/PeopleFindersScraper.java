import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class PeopleFindersScraper {

    public static void main(String[] args) throws Exception {

        final String lastName = "smith";
        final String city = "New York";
        final String state = "New York";

        final HttpResponse<String> response = Unirest.get("https://www.peoplefinders.com/Widget/GetWidgets?&resultType=multiple")
                .queryString("ln", lastName)
                .queryString("LastName", lastName)
                .queryString("city", city)
                .queryString("state", state)
                .asString();

        final Document htmlSnippet = Jsoup.parseBodyFragment(response.getBody());

        for (Element peopleResult : htmlSnippet.select("div.row")){
            System.out.println(peopleResult.child(0).text());
            System.out.println("..........................");
        }
    }
}
