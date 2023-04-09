package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I click enter button")
    public void clickMasukButton(){
        loginPage.clickMasukButton();
    }


    @And("I input valid Email")
    public void inputValidEmail(){
        loginPage.inputEmail("riskadwi583@gmail.com");
    }

    @And("I input invalid email")
    public void inputInvalidEmail(){
        loginPage.inputEmail("riska583@@gmail.com");
    }

    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Riskaya123");
    }

    @And("I input invalid password")
    public void inputInvalidPassword(){
        loginPage.inputPassword("ris123");
    }

    @And("I click login button")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();}

    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }

    @Then("I can see error message {string}")
    public void doSeeErrorMessage(String message){
        loginPage.validateErrorMessageDisplayed();
        loginPage.validateEqualErrorMessage(message);

    }
}
