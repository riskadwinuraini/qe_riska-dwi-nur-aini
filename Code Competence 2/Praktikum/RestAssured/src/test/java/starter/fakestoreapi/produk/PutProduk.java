package starter.fakestoreapi.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PutProduk {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I set PUT endpoints")
    public String iSetPUTEndpoints(){
        return url + "products/7";
    }

    @Step("I send PUT HTTP request")
    public void iSendPUTHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "originote");
        requestBody.put("price", 100.000);
        requestBody.put("description", "skincare");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "skincaree");


        SerenityRest.given().body(requestBody.toJSONString()).put(iSetPUTEndpoints());
    }
    @Step("I receive a valid HTTP response code {int} in products")
    public void iReceiveAValidHTTPResponseCodeOnTheProductSPUT(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for the products")
    public void iReceiveValidDataForTheProduct(){
        restAssuredThat(response -> response.body("'title'", equalTo("originote")));
        restAssuredThat(response -> response.body("'price'", equalTo(100.000)));
        restAssuredThat(response -> response.body("'description'", equalTo("skincare")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("'category'", equalTo("skincaree")));
    }
}
