package Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.example.constants.constants.*;
public class NewMakePopupPage {
    private final SelenideElement MAKE_POPUP_BTN = $(" app-header > a");
    private final SelenideElement MAKE_FROM_BLANK_BTN = $("div.sp-templates-item.sp-templates-default > img");
    private final SelenideElement CLICK_ON_NAME_CHANGE = $("#content-wrapper > app-root > app-constructor > app-layout > div > nav > app-header > div > div.sp-navbar-header > app-popup-name > div > span > span");
    private final SelenideElement NEW_POPUP_NAME_INPUT = $("#content-wrapper > app-root > app-constructor > app-layout > div > nav > app-header > div > div.sp-navbar-header > app-popup-name > div > div > app-input-text > div > input");

    public NewMakePopupPage newMakePopupPage() {
        MAKE_POPUP_BTN.click();
        MAKE_FROM_BLANK_BTN.click();
        return this;
    }



    public NewMakePopupPage clickNext() {
        NEXT_BTN.shouldBe(Condition.exist).click();
        System.out.println("click");
        return this;

    }


    public NewMakePopupPage saveAndClose () {

            SAVE_AND_CLOSE.shouldBe(exist);
            SAVE_AND_CLOSE.click();
        System.out.println("S&c");
            if (NO_LEAD_WARNING.exists()) {
                NO_LEAD_WARNING.click();
            }
            return this;

    }
    public NewMakePopupPage makeName() {
        CLICK_ON_NAME_CHANGE.click();
        NEW_POPUP_NAME_INPUT .sendKeys(Keys.CONTROL + "a");
        NEW_POPUP_NAME_INPUT.sendKeys("autopopup");
        return this;
    }


}
