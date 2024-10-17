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
//            options.addArguments("--disable-notifications"); //для head
            options.addArguments("--disable-extensions");      //для headless
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--incognito");

            Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
            Configuration.timeout = 10000;
            Configuration.holdBrowserOpen = true;
//            Configuration.headless = true;

//            Configuration.browserCapabilities = options;
            //а вот это под вопросом. не работает - сотри!!!!!!!!!!!!!

            LoginPage loginPage = new LoginPage();
            loginPage.login();

        }

        @Before
        public void init() {
            setUp();
        }

        @After
        public void tearDown() {
            Selenide.closeWebDriver();
        }
    }