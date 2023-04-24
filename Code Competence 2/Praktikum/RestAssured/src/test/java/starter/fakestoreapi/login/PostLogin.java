package starter.fakestoreapi.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostLogin {
    protected static String url = "https://fakestoreapi.com/auth/";
    @Step("I set POST endpoints")
    public String PostEndpointLogin(){
        return url + "login";
    }
    @Step("I send POST HTTP request")
    public void PostHttpRequestLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(PostEndpointLogin());
    }
    @Step("I receive valid HTTP response code login 200")
    public void iReceiveValidHTTPResponseCodeLogin200(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive the correct data")
    public void receiveCorrectDataLogin(){
        restAssuredThat(response -> response.body("username'", equalTo("mor_2314")));
        restAssuredThat(response -> response.body("'password'", equalTo("83r5^_")));

    }
}