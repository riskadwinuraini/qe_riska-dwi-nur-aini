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
    public void onTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid username")
    public void inputValidUserName() {
        loginPage.inputUserName("standard_user");
    }

    @When("I input invalid username")
    public void inputInvalidUsername(){
        loginPage.inputUserName("user123");
    }
    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I input invalid password")
    public void doEnterInvalidPassword(){
        loginPage.inputPassword("secretsauce");}

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage() {
        homePage.validateOnHomePage();
    }

    @Then("I can see error message {string}")
    public void doSeeErrorMessage(String message){
        loginPage.validateErrorMessageDisplayed();
        loginPage.validateEqualErrorMessage(message);
    }


    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
    }

    @When("I input valid Nama Lengkap")
    public void iInputValidNamaLengkap() {
    }

    @When("I input valid Email")
    public void iInputValidEmail() {
    }

    @When("I input valid Password")
    public void iInputValidPassword() {
    }

    @Then("I am on the Home Page")
    public void iAmOnTheHomePage() {
    }

    @And("I click register button")
    public void iClickRegisterButton() {
    }
}