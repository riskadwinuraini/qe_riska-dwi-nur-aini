package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PutCart {
    protected static String url ="'https://fakestoreapi.com/";

    @Step("I set the PUT api endpoints in cart")
    public String iSetThePUTApiEndpointsInCart(){
        return url + "carts/7";
    }
    @Step("I send HTTP api PUT request")
    public void iSendHTTPApiPUTRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId","3");
        requestBody.put("date","2019-12-10");
        requestBody.put("products","{'product': 1, 'quantity': 3}");

        SerenityRest.given().body(requestBody.toJSONString()).put(iSetThePUTApiEndpointsInCart());
    }
    @Step("I receive valid HTTP response code 200 in carts")
    public void iReceiveValidHTTPResponseCodeInCarts(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data for the carts")
    public void iReceiveValidDataForTheCarts(){
        restAssuredThat(response -> response.body("'userId'",equalTo("3")));
        restAssuredThat(response -> response.body("'date'",equalTo("2019-12-10")));
        restAssuredThat(response -> response.body("'products'",equalTo("[{productId:1,quantity:3}]")));

    }
}
