package Pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.*;

public class LoginPage {
    private final SelenideElement LOGIN_INPUT = $(By.cssSelector("#login"));
    private final SelenideElement PASS_INPUT = $(By.cssSelector("#password"));
    private final SelenideElement SUBMIT_BTN = $(By.cssSelector("button[name='submit']"));

//    public void login() {
//        open(ENVIRONMENT);
//        LOGIN_INPUT.sendKeys(LOGIN);
//        PASS_INPUT.sendKeys(PASS);
//        SUBMIT_BTN.click();
//            }
    public void login() {
        open(ENVIRONMENT);
        LOGIN_INPUT.sendKeys(LOGIN);
        PASS_INPUT.sendKeys(PASS);
        SUBMIT_BTN.click();
//        /**
//         * Получаем токен
//         */
//        Cookie cookie = WebDriverRunner.getWebDriver().manage().getCookieNamed("oauth_access_token");
//        String access_token = cookie.getValue();
//        System.out.println("Значение куки oauth_access_token: " + access_token);
//        return access_token;
 }

}
