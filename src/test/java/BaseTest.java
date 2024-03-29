import Client.ApiCheck;
import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

abstract public class BaseTest {


    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications"); //для head
        options.addArguments("--disable-extensions");      //для headless
        options.addArguments("--window-size=2048,1900");
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

//        WebDriverManager.firefoxdriver().setup();
//        Configuration.browser = "firefox";

        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;

//        Configuration.holdBrowserOpen =true;
        Configuration.headless = true;
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @Before
    public void init() {
        setUp();
        new ApiCheck().ShowUserPlans();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}