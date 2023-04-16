package starter.fakestoreapi.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url ="https://fakestoreapi.com/users/6";

    @Step("I set the DELETE api endpoints")
    public String iSetTheDELETEApiEndpoints(){
        return url + "users/6";
    }
    @Step("I send HTTP api DELETE request for user")
    public void iSendHTTPApiDELETERequestForUser(){
        SerenityRest.given().delete(iSetTheDELETEApiEndpoints());
    }
    @Step("I receive valid HTTP response code {int} for user DELETE")
    public void iReceiveValidHTTPResponseCodeForUserDELETE(){
        restAssuredThat(response -> response.statusCode(200));

    }


}
