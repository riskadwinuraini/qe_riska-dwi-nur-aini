package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCart {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "carts";
    }
    @Step("I send HTTP api GET request")
    public void iSendHTTPApiGETRequest(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200 for GET All data cart")
    public void iReceiveAValidHTTPResponseCodeForGetAllDataCart(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all carts")
    public void iReceiveValidDataForAllCarts(){
    }
}
