package starter.fakestoreapi.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProduct {

    protected static String url = "https://fakestoreapi.com/";

    @Step("I set GET endpoints")
    public String GetApiEndpoint(){
        return url + "products";
    }
    @Step("I send GET HTTP request")
    public void GetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(GetApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all products")
    public void validateDataDetailproduct(){
    }
}
