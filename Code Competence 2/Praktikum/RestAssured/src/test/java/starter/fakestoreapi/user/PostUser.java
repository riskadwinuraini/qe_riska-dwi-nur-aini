package starter.fakestoreapi.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostUser {
    protected String url ="https://fakestoreapi.com/";

    @Step("I set the POST api endpoints")
    public String iSetThePOSTApiEndpoints() {
        return url + "users";
    }
    @Step("I send HTTP api POST request for user")
    public void iSendHTTPApiPOSTRequestForUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");

        SerenityRest.given().body(requestBody.toJSONString()).post(iSetThePOSTApiEndpoints());

    }
    @Step("I receive a valid HTTP response code {int} on the user POST")
    public void iReceiveAValidHTTPResponseCodeOnTheUserPOST(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        restAssuredThat(response -> response.body("'email'", equalTo("John@gmail.com")));
        restAssuredThat(response -> response.body("'username'", equalTo("johnd")));
        restAssuredThat(response -> response.body("'password'", equalTo("m38rmF$")));

    }
}
