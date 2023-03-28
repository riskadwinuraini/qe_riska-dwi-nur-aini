package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.MainPage.Message;

public class MessageSteps {
    @Steps
    Message Page;

    @Given("a user goes to their profile home page")
    public void OpenProfileHomePage(){ Page.OpenProfileHomePage();}
    @When("a user opens another user's profile")
    public void OpenProfile(){
        Page.OpenProfile();
    }
    @And("a user clicks the Send Message button and enter a message")
    public void MessageButton(){
        Page.MessageButton();
    }
    @Then("a user should be able to send messages to that other user")
    public void SendingMessage(){
        Page.SendingMessage();
    }
}
