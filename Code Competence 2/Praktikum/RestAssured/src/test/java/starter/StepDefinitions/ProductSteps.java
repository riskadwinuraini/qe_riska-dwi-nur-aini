package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.produk.DeleteProduct;
import starter.fakestoreapi.produk.GetAllProduct;
import starter.fakestoreapi.produk.GetIdProduct;
import starter.fakestoreapi.produk.PutProduk;

public class ProductSteps {
    @Steps
    GetAllProduct getAllProduct;
    @Steps
    PutProduk putProduk;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    GetIdProduct getIdProduct;

    @Given("I set GET endpoints")
    public void iSetGETEndpoints() {
        getAllProduct.GetApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        getAllProduct.GetHttpRequest();
    }
    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getAllProduct.validateHttpResponseCode200();
    }
    @And("I received valid data for all products")
    public void iReceivedValidDataForAllProducts() {
        getAllProduct.validateDataDetailproduct();
    }


    @Given("I set PUT endpoints")
    public void iSetPUTEndpoints() {
        putProduk.iSetPUTEndpoints();
    }

    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        putProduk.iSendPUTHTTPRequest();
    }

    @Then("I receive a valid HTTP response code {int} in products")
    public void iReceiveAValidHTTPResponseCodeOnTheProductSPUT() {
        putProduk.iReceiveAValidHTTPResponseCodeOnTheProductSPUT();
    }

    @And("I receive valid data for the products")
    public void iReceiveValidDataForTheProduct() {
        putProduk.iReceiveValidDataForTheProduct();
    }


    @Given("I set DELETE endpoints")
    public void iSetDELETEEndpoints() {

        deleteProduct.iSetDELETEEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {

        deleteProduct.iSendDELETEHTTPRequest();
    }

    @Then("I receive a valid HTTP response code {int} in products DELETE")
    public void iReceiveAValidHTTPResponseCodeOnAProductDELETE(int arg0) {
        deleteProduct.iReceiveAValidHTTPResponseCodeOnAProductDELETE();
    }

    @Given("I set GET endpoints by id")
    public void iSetGETEndpointsById() {
        getIdProduct.iSetGETEndpointsById();
    }

    @When("I send GET HTTP request by id")
    public void iSendGETHTTPRequestById() {
        getIdProduct.iSendGETHTTPRequestById();
    }

    @Then("I receive a valid HTTP response code {int} for Get id data users")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataUsers(int arg0) {
        getIdProduct.iReceiveAValidHTTPResponseCodeForGetIdDataUsers();
    }

    @And("I received valid data for id products")
    public void iReceivedValidDataForIdProducts() {
        getIdProduct.iReceivedValidDataForIdProducts();
    }
}
