package starter.MainPage;

import net.thucydides.core.annotations.Step;

public class Message {
    @Step("a user goes to their profile home page")
    public void OpenProfileHomePage(){
        System.out.println("the user goes to their profile home page");
    }
    @Step("a user opens another user's profile")
    public void OpenProfile(){
        System.out.println("the user opens another user's profile");

    }
    @Step("a user clicks the Send Message button and enter a message")
    public void MessageButton(){
        System.out.println("the user clicks the Send Message button and enter a message");

    }
    @Step("a user should be able to send messages to that other user")
    public void SendingMessage(){
        System.out.println("a user should be able to send messages to that other user");

    }

}