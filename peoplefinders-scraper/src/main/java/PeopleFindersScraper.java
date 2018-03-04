import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class PeopleFindersScraper {

    public static void main(String[] args) throws Exception {

        final HttpResponse<String> response = Unirest.get("https://www.peoplefinders.com/Widget/GetWidgets?ln=smith&city=New%20York&state=NY&resultType=multiple").asString();

        System.out.println(response.getBody());
    }
}
