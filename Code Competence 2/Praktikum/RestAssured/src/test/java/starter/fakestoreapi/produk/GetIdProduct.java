package starter.fakestoreapi.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdProduct {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I set GET endpoints by id")
    public String iSetGETEndpointsById(){
        return url+ "products/1";
    }
    @Step("I send GET HTTP request by id")
    public void iSendGETHTTPRequestById(){
        SerenityRest.given()
                .when()
                .get(iSetGETEndpointsById());
    }
    @Step("I receive a valid HTTP response code 200 for Get id data users")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataUsers(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for id products")
    public void iReceivedValidDataForIdProducts(){

    }
}
