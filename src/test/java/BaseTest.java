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
            options.addArguments("--headless=old");
//            Configuration.holdBrowserOpen = true;
            options.addArguments("--disable-notifications"); //для head
            options.addArguments("--disable-extensions");      //для headless
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--incognito");
            options.addArguments("--disable-gpu"); //попытка вырубить фрейм браузера
            Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
            WebDriverManager.chromedriver().setup();
            Configuration.timeout = 10000;


//            Configuration.headless = true;   c 129й версии хедлесс задается так ("--headless=old")
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