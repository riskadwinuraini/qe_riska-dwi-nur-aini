package starter.MainPage;


import net.thucydides.core.annotations.Step;

public class Profile {
    @Step("a user goes to their profile home page")
    public void OpenProfile(){System.out.println("a user goes to their profile home page");

    }
    @Step("a enters name or keyword in search box")
    public void EnterName(){System.out.println("a enters name or keyword in search box");

    }
    @Step("a user clicks search")
    public void Click(){System.out.println("a user clicks search");

    }
    @Step("user should get a list of relevant LinkedIn profiles")
    public void LinkedInProfile(){System.out.println("user should get a list of relevant LinkedIn profiles");

    }
}

