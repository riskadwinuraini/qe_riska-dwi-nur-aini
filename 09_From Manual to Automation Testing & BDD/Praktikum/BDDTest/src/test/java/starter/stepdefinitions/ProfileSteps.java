package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.MainPage.Profile;

public class ProfileSteps {
    @Steps
    Profile Home;

    @Given("the user goes to their profile home page")
    public void OpenProfile(){ Home.OpenProfile();}
    @When("a enters name or keyword in search box")
    public void EnterName(){ Home.EnterName();}
    @And("a user clicks search")
    public void Click(){ Home.Click();}
    @Then("user should get a list of relevant LinkedIn profiles")
    public void LinkedInProfile(){ Home.LinkedInProfile();}
}
