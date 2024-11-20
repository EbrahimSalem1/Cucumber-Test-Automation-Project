package steps;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import java.io.IOException;

public class LoginSteps extends Base {
    public LoginSteps() throws IOException {
        super();
    }
    LoginPage log;


    @Given("User open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() {
        setUp();
    }

    @When("User fill {string} and {string} and Assert on login Title Text")
    public void userFillAndAndAssertOnLoginTitleText( String username ,String password) {
        log = homePage.clickOnLoginLink();
        log.insertLoginEmail(props.getProperty("username"));
        log.insertLoginPassword(props.getProperty("password"));
    }

    @Then("User should be see the Assertion on Login Title Text is successfully")
    public void userShouldBeSeeTheAssertionOnLoginTitleTextIsSuccessfully() {
        Assert.assertEquals(log.getLoginTitleTxt(), "Login to your account");
    }

}