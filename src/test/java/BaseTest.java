import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;


abstract public class BaseTest {
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriverManager.chromedriver().setup();
        Configuration.browser ="chrome";
        Configuration.driverManagerEnabled =true;
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;


        Configuration.headless = false;
        Configuration.holdBrowserOpen =true;
//        Configuration.headless = true;
//        Configuration.holdBrowserOpen =false;
        LoginPage loginPage = new LoginPage();
        loginPage.login();


    }

    @Before
    public void init(){
        setUp();
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }

}