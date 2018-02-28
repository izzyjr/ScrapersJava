import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONObject;

public class UnirestTest {

    public static void main(String[] args) throws Exception{

        //Change the default user-agent header
        Unirest.setDefaultHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36");

        //Use a proxy
//        Unirest.setProxy(new HttpHost("61.135.217.12", 80));

        //Making simple http request to httpbin.org
        final HttpResponse<JsonNode> getResponse = Unirest.get("https://httpbin.org/get").queryString("Limit", 10).asJson();


        System.out.println("IP-Address: " + getResponse.getBody().getObject().getString("origin"));

        System.out.println("User-Agent: " + getResponse.getBody().getObject().getJSONObject("headers").getString("User-Agent"));

        System.out.println("\n\n.........................................................................\n\n");

        //Make first post request with form data
        final HttpResponse<String> postResponseOne = Unirest.post("https://httpbin.org/post").field("Postal-Code", 12345).asString();

        System.out.println(postResponseOne.getBody());

        System.out.println("\n\n.........................................................................\n\n");

        //Make post request with body data(Json)
        final JSONObject exampleJson = new JSONObject().put("Postal-Code", 12345);

        final HttpResponse<String> postResponseTwo = Unirest.post("https://httpbin.org/post").body(exampleJson).asString();

        System.out.println(postResponseTwo.getBody());


    }
}
