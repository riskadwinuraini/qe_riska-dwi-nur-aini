package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField() {
        return By.id("email");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By enterButton() {
        return By.id("submit_login");
    }

    @Step
    public void openPage(){
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(enterButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickEnterButton(){
        $(enterButton()).click();
    }

}