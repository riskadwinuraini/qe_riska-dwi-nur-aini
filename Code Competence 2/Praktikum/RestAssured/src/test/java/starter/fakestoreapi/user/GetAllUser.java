package starter.fakestoreapi.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUser {

    protected static String url = "https://fakestoreapi.com/";

    @Step("I set the GET api endpoint for the user")
    public String iSetTheGETApiEndpointForTheUser(){
        return url + "users";
    }
    @Step("I send HTTP api GET request for user")
    public void iSendHTTPApiGETRequestsForUsers(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpointForTheUser());
    }
    @Step("I receive a valid HTTP response code {int} for Get All data users")
    public void iReceiveAValidHTTPResponseCodeForGetAllDataUsers(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all users")
    public void iReceiveValidDataForAllUsers(){
    }

}
