package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostIDPositif {

    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoints(){
        return url + "posts";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id","10");
        requestBody.put("title","Bunga Matahari");
        requestBody.put("body","bunga matahari yang indah berwarna kuning");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response ->response.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void validateDataNewUser(){
        restAssuredThat(response -> response.body("'user_id'", equalTo("10")));
        restAssuredThat(response -> response.body("'title'", equalTo("Bunga Matahari")));
        restAssuredThat(response -> response.body("'body'", equalTo("bunga mata hari yang indah berwarna kuning")));
    }

}
