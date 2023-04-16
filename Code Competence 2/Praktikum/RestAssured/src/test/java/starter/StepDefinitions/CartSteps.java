package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.cart.DeleteCart;
import starter.fakestoreapi.cart.GetAllCart;
import starter.fakestoreapi.cart.GetIdCart;
import starter.fakestoreapi.cart.PutCart;
import starter.fakestoreapi.produk.DeleteProduct;

public class CartSteps {
    @Steps
    GetAllCart getAllCart;
    @Steps
    PutCart putCart;
    @Steps
    DeleteCart deleteCart;
    @Steps
    GetIdCart getIdCart;


    @Given("I set the GET api endpoint")
    public void iSetTheGETApiEndpoint() {
        getAllCart.iSetTheGETApiEndpoint();
    }

    @When("I send HTTP api GET request")
    public void iSendHTTPApiGETRequest() {
        getAllCart.iSendHTTPApiGETRequest();
    }

    @Then("I receive a valid HTTP response code {int} for GET All data cart")
    public void iReceiveAValidHTTPResponseCodeForGetAllDataCart(int arg0) {
        getAllCart.iReceiveAValidHTTPResponseCodeForGetAllDataCart();
    }

    @And("I receive valid data for all carts")
    public void iReceiveValidDataForAllCarts() {
        getAllCart.iReceiveValidDataForAllCarts();
    }


    @Given("I set the PUT api endpoints in cart")
    public void iSetThePUTApiEndpointsInCart() {
        putCart.iSetThePUTApiEndpointsInCart();
    }

    @When("I send HTTP api PUT request")
    public void iSendHTTPApiPUTRequest() {
        putCart.iSendHTTPApiPUTRequest();
    }

    @Then("I receive valid HTTP response code {int} in carts")
    public void iReceiveValidHTTPResponseCodeInCarts(int arg0) {
        putCart.iReceiveValidHTTPResponseCodeInCarts();
    }

    @And("I receive valid data for the carts")
    public void iReceiveValidDataForTheCarts() {
        putCart.iReceiveValidDataForTheCarts();
    }

    @Given("I set the DELETE api endpoints in cart")
    public void iSetTheDELETEApiEndpointsInCart() {
        deleteCart.iSetTheDELETEApiEndpointsInCart();
    }

    @When("I send HTTP api DELETE request")
    public void iSendHTTPApiDELETERequest() {
       deleteCart.iSendHTTPApiDELETERequest();
    }

    @Then("I receive valid HTTP response code {int} in carts DELETE")
    public void iReceiveValidHTTPResponseCodeInCartsDELETE(int arg0) {
        deleteCart.iReceiveValidHTTPResponseCodeInCartsDELETE();
    }

    @Given("I set the GET api endpoint by id")
    public void iSetTheGETApiEndpointById() {
        getIdCart.iSetTheGETApiEndpointById();

    }

    @When("I send HTTP api GET request by id")
    public void iSendHTTPApiGETRequestById() {
        getIdCart.iSendHTTPApiGETRequestById();
    }

    @Then("I receive a valid HTTP response code {int} for Get id data carts")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataCarts(int arg0) {
        getIdCart.iReceiveAValidHTTPResponseCodeForGetIdDataCarts();
    }

    @And("I receive valid data for id carts")
    public void iReceiveValidDataForIdCarts() {
        getIdCart.iReceiveValidDataForIdCarts();
    }
}
