package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdCart {
    protected static String url ="https://fakestoreapi.com/";

    @Step("I set the GET api endpoint by id")
    public String iSetTheGETApiEndpointById(){
        return url + "carts/5";
    }
    @Step("I send HTTP api GET request by id")
    public void iSendHTTPApiGETRequestById(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpointById());
    }
    @Step("I receive a valid HTTP response code 200 for Get id data carts")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataCarts(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data for id carts")
    public void iReceiveValidDataForIdCarts(){

    }
}
