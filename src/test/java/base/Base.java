package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    protected static HomePage homePage;
    public static Properties props = new Properties();

    public Base() throws IOException {
        File file = new File("src/main/java/properties/config.properties");
        FileInputStream fis = new FileInputStream(file);
        props.load(fis);
    }


    public static void setUp(){
        if (props.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(props.getProperty("Url"));
            homePage = new HomePage(driver);
        } else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
            driver = new  FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(props.getProperty("Url"));
            homePage = new HomePage(driver);
        }
    }
}
