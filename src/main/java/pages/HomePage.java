package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver){
        super(driver);
    }


    private final By homePageLink = By.xpath("//a[normalize-space()='Home']");
    private final By signUpAndLoginLink = By.cssSelector("a[href='/login']");


    public boolean getHomeLinkText(){
        return driver.findElement(homePageLink).isDisplayed();
    }

    public LoginPage clickOnLoginLink()
    {
        driver.findElement(signUpAndLoginLink).click();
        return new LoginPage(driver);
    }

}