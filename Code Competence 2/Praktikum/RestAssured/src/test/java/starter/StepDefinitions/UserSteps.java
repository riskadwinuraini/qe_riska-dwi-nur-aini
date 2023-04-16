package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.user.DeleteUser;
import starter.fakestoreapi.user.GetAllUser;
import starter.fakestoreapi.user.PostUser;

public class UserSteps {

    @Steps
    GetAllUser getAllUser;

    @Steps
    PostUser postUser;
    @Steps
    DeleteUser deleteUser;


    @Given("I set the GET api endpoint for the user")
    public void iSetTheGETApiEndpointForTheUser() {
        getAllUser.iSetTheGETApiEndpointForTheUser();
    }

    @When("I send HTTP api GET request for user")
    public void iSendHTTPApiGETRequestsForUsers() {
        getAllUser.iSendHTTPApiGETRequestsForUsers();
    }

    @Then("I receive a valid HTTP response code {int} for Get All data users")
    public void iReceiveAValidHTTPResponseCodeForGetAllDataUsers(int arg0) {
        getAllUser.iReceiveAValidHTTPResponseCodeForGetAllDataUsers();
    }

    @And("I receive valid data for all users")
    public void iReceivedValidDataForAllUsers() {
        getAllUser.iReceiveValidDataForAllUsers();
    }

    @Given("I set the POST api endpoints")
    public void iSetThePOSTApiEndpoints() {
        postUser.iSetThePOSTApiEndpoints();
    }

    @When("I send HTTP api POST request for user")
    public void iSendHTTPApiPOSTRequestForUser() {
        postUser.iSendHTTPApiPOSTRequestForUser();
    }

    @Then("I receive a valid HTTP response code {int} on the user POST")
    public void iReceiveAValidHTTPResponseCodeOnTheUserPOST(int arg0) {
        postUser.iReceiveAValidHTTPResponseCodeOnTheUserPOST();
    }

    @And("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        postUser.iReceiveValidDataForNewUser();
    }

    @Given("I set the DELETE api endpoints")
    public void iSetTheDELETEApiEndpoints() {
        deleteUser.iSetTheDELETEApiEndpoints();
    }

    @When("I send HTTP api DELETE request for user")
    public void iSendHTTPApiDELETERequestForUser() {
        deleteUser.iSendHTTPApiDELETERequestForUser();
    }

    @Then("I receive valid HTTP response code {int} for user DELETE")
    public void iReceiveValidHTTPResponseCodeForUserDELETE(int arg0) {
        deleteUser.iReceiveValidHTTPResponseCodeForUserDELETE();
    }
}
