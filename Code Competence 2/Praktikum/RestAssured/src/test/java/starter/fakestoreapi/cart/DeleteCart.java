package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCart {
    protected static String url ="https://fakestoreapi.com/";

    @Step("I set the DELETE api endpoints in cart")
    public String iSetTheDELETEApiEndpointsInCart(){
        return url + "carts/6";
    }
    @Step("I send HTTP api DELETE request")
    public void iSendHTTPApiDELETERequest(){
        SerenityRest.given().delete(iSetTheDELETEApiEndpointsInCart());
    }
    @Step("I receive valid HTTP response code 200 in carts DELETE")
    public void iReceiveValidHTTPResponseCodeInCartsDELETE(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
