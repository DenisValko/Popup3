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


    public void login() {
        open(ENVIRONMENT);
        LOGIN_INPUT.sendKeys(LOGIN);
        PASS_INPUT.sendKeys(PASS);
        SUBMIT_BTN.click();
    }
}
