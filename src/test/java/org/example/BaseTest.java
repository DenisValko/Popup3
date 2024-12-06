package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

    abstract public class BaseTest {
        public void setUp() {
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless=old");
            Configuration.holdBrowserOpen = true;
            options.addArguments("--disable-notifications"); //для head
            options.addArguments("--disable-extensions");      //для headless
            options.addArguments("--window-size=1920,1080");
//            options.addArguments("--incognito");
            options.addArguments("--disable-gpu"); //попытка вырубить фрейм браузера(успешная)
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
            Configuration.timeout = 10000;
            WebDriverManager.chromedriver().setup();

         //   Configuration.headless = true;  // c 129й версии хедлесс задается так ("--headless=old")
            LoginPage loginPage = new LoginPage();
            loginPage.login();
        }

        @BeforeEach
        public void init() {
            setUp();
        }

        @AfterEach
        public void tearDown() {
            Selenide.closeWebDriver();
        }
    }