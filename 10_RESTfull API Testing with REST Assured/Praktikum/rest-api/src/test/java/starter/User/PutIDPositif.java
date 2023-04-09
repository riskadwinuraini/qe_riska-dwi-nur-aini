package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutIDPositif {

    protected String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set PUT api endpoints")
    public String setPutApiEndpoints(){
        return url + "users/1";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", "1");
        requestBody.put("id","1");
        requestBody.put("title","Bunga Matahari");
        requestBody.put("body","indah setiap hari");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).put(setPutApiEndpoints());
    }

    @Step("I received the correct HTTP response code which was 200")
    public void Response200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for update user")
    public void validateDataUpdateUser(){
        restAssuredThat(response -> response.body("'user_id'", equalTo("1")));
        restAssuredThat(response -> response.body("'id'", equalTo("1")));
        restAssuredThat(response -> response.body("'title'", equalTo("Bunga Matahari")));
        restAssuredThat(response -> response.body("'body'", equalTo("indah setiap hari")));
    }
}
