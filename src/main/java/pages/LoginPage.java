package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {

    public LoginPage(WebDriver driver){
        super(driver);
    }


    private final By loginText= By.xpath("//h2[normalize-space()='Login to your account']");
    private final By signInEmailField=By.cssSelector("input[data-qa='login-email']");
    private final By signInPasswordField=By.cssSelector("input[placeholder='Password']");


    public String getLoginTitleTxt(){
        return driver.findElement(loginText).getText();
    }

    public void insertLoginEmail(String email){
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void insertLoginPassword(String pass){
        driver.findElement(signInPasswordField).sendKeys(pass);
    }

}