import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage {
    private final SelenideElement LOGIN_INPUT = $(By.cssSelector("#login"));
    private final SelenideElement PASS_INPUT = $(By.cssSelector("#password"));
    private final SelenideElement SUBMIT_BTN = $(By.cssSelector("button[name='submit']"));
    public final String PASS = "123456";
    public final String LOGIN = "d.valko+prod_auto@sendpulse.com";

    public void login() {
        open("https://login.sendpulse.com/login/");
        LOGIN_INPUT.sendKeys(LOGIN);
        PASS_INPUT.sendKeys(PASS);
        SUBMIT_BTN.click();
    }
}