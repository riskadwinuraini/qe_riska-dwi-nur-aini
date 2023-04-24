package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.login.PostLogin;

public class LoginSteps {

    @Steps
    PostLogin postLogin;
    @Given("I set POST endpoints")
    public void iSetPOSTEndpoints() {
        postLogin.PostEndpointLogin();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        postLogin.PostHttpRequestLogin();
    }

    @And("I receive valid HTTP response code login {int}")
    public void iReceiveValidHTTPResponseCodeLogin200() {
        postLogin.iReceiveValidHTTPResponseCodeLogin200();
    }

    @Then("I receive the correct data")
    public void iReceiveTheCorrectData() {
        postLogin.receiveCorrectDataLogin();
    }

}