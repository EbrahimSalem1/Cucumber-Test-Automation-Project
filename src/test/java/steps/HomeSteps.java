package steps;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import java.io.IOException;

public class HomeSteps extends Base {
    public HomeSteps() throws IOException {
        super();
    }

    @Given("User open the website he will see Home Page")
    public void user_open_the_website_he_will_see_Home_Page(){
        setUp();
    }

    @When("User Assert on Home Page Link")
    public void userAssertOnHomePageLink() {
        HomePage home = homePage;
        Assert.assertTrue(home.getHomeLinkText() , "Home Page is visible");
    }

    @Then("User should be see the Assertion is successfully")
    public void userShouldBeSeeTheAssertionIsSuccessfully() {
        HomePage home = homePage;
        Assert.assertTrue(home.getHomeLinkText() , "Home");


    }
}
