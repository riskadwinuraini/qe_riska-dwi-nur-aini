package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteIDPositif {

    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoints(){
        return url + "post/1";
    }
    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }
    @Step("I receive valid HTTP response code 204")
    public void ValidHttpResponseCode204(){
        restAssuredThat(response -> response.statusCode(204));
    }
    @Step("I can delete data by id")
    public void DeleteValid(){
        restAssuredThat(response -> response.statusCode(204));
    }

}
