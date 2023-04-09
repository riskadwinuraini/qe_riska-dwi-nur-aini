package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By MasukButton(){
        return By.id("button_signin_home");
    }
    private By emailField() {return By.id("email");}
    private By passwordField() {
        return By.id("password");
    }
    private By ButtonLogin(){return By.id("submit_login");}
    private By errorMessage(){ return By.id("alert_description");}


    @Step
    public void openPage(){
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(MasukButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String phone){
        $(emailField()).type(phone);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickMasukButton(){
        $(MasukButton()).click();
    }

    @Step
    public void clickButtonLogin(){
        $(ButtonLogin()).click();
    }

    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

}