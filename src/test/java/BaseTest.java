import Client.ApiCheck;
import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;


abstract public class BaseTest {
    public static String access_token;
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications"); //для head
        options.addArguments("--disable-extensions");      //для headless
        options.addArguments("--window-size=2048,1600");
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriverManager.chromedriver().setup();
        Configuration.browser ="chrome";
        Configuration.driverManagerEnabled =true;
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;

//        Configuration.holdBrowserOpen =true;
        Configuration.headless = true;
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Cookie cookie = WebDriverRunner.getWebDriver().manage().getCookieNamed("oauth_access_token");
        access_token = cookie.getValue();
        System.out.println("Значение куки oauth_access_token: " + access_token);
    }

    @Before
    public void init(){
        setUp();
        new ApiCheck().ShowUserPlans();
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }

}