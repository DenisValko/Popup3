package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.*;

public class LoginPage {
    private final SelenideElement LOGIN_INPUT = $(By.cssSelector("#login"));
    private final SelenideElement PASS_INPUT = $(By.cssSelector("#password"));
    private final SelenideElement SUBMIT_BTN = $(By.cssSelector("button[name='submit']"));
    private final SelenideElement ENTER_ACCOUNT = $(By.cssSelector("#session-limit-free-tariff > div > div > div.modal-footer > button.btn.btn-success.moder-ok"));

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
        boolean isNeedEnter = ENTER_ACCOUNT.isDisplayed();
        if (isNeedEnter){
            ENTER_ACCOUNT.click();
        }
//        /**
//         * Получаем токен
//         */
//        Cookie cookie = WebDriverRunner.getWebDriver().manage().getCookieNamed("oauth_access_token");
//        String access_token = cookie.getValue();
//        System.out.println("Значение куки oauth_access_token: " + access_token);
//        return access_token;
 }

}
