package Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.*;

public class NewMakePopupPage {
    private final SelenideElement MAKE_POPUP_BTN = $(" app-header > a");
    private final SelenideElement MAKE_FROM_BLANK_BTN = $("div.sp-templates-item.sp-templates-default > img");
    private final SelenideElement CLICK_ON_NAME_CHANGE = $("app-popup-name > div > span > i");
    private final SelenideElement NEW_POPUP_NAME_INPUT = $("app-popup-name > div > div > app-input-text > div > input");
    private final SelenideElement DELETE_POPUP_MENU_BTN = $("div.project-preview-heading> div > div.btn-group> div");
//    private final SelenideElement LAUNCHER_POPUP_DEL_BTN = $x("(//a[contains(text(),'Удалить')])[1]");
    private final SelenideElement POPUP_DEL_BTN = $("#dropdown-animated > li:nth-child(2)");
    private final SelenideElement MODAL_DEL_BTN = $x("//button[contains(text(),'Удалить')]");
    private final String DESIGN_SAVE = ("https://login.sendpulse.com/pop-ups/builder/ceb77478-19c6-4d70-b1a2-c3b28a9abd72/create/design");
    private final String TARGETING_SAVE = ("https://login.sendpulse.com/pop-ups/builder/ceb77478-19c6-4d70-b1a2-c3b28a9abd72/create/targeting");
    private final String SAVING_SAVE = ("https://login.sendpulse.com/pop-ups/builder/ceb77478-19c6-4d70-b1a2-c3b28a9abd72/create/saving");
    private final SelenideElement SINGLE_POPUP = $("body > modal-container > div.modal-dialog > div > app-popup-type > div.modal-body > div > a:nth-child(1)");
    private final SelenideElement INLINE_POPUP = $("body > modal-container > div.modal-dialog > div > app-popup-type > div.modal-body > div > a:nth-child(2)");
    private final SelenideElement CONDITION_AFTER_CLICK = $("//span[text()=\"После клика на лаунчер\"]");
    private final SelenideElement CONDITION_CLICKS = $("//label[text()=\" Клики \"]");
    private final SelenideElement CONDITION = $("//div[@class='form-control dropdown-custom dropdown-action']");

    public NewMakePopupPage newMakePopup() {
        MAKE_POPUP_BTN.click();
        SINGLE_POPUP.click();
        return this;
    }

    Logger logger = LoggerFactory.getLogger(NewMakePopupPage.class);

    public NewMakePopupPage designClickNext() {
        String currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
        while (!currentURL.equals(DESIGN_SAVE)){
            currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
            logger.info("***designClickNext***");
        }
        NEXT_BTN.shouldBe(Condition.exist).shouldBe(visible).click();
        return this;
    }
    public NewMakePopupPage targetClickNext() {
        logger.info("***targetClickNext***");
        String currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
        while (!currentURL.equals(TARGETING_SAVE)){
            currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
        }
        NEXT_BTN.shouldBe(Condition.exist).shouldBe(visible).click();
        return this;
    }

    public NewMakePopupPage saveAndClose () {
        String currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
        while (!currentURL.equals(SAVING_SAVE)){
            currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
        }
            SAVE_AND_CLOSE.shouldBe(exist);
            SAVE_AND_CLOSE.click();
            logger.info("***Save&click***");
            if (NO_LEAD_WARNING.exists()) {
                NO_LEAD_WARNING.click();
            }
            return this;

    }
    public NewMakePopupPage makeName() {
        CLICK_ON_NAME_CHANGE.click();
        NEW_POPUP_NAME_INPUT .sendKeys(Keys.CONTROL + "a");
        NEW_POPUP_NAME_INPUT.sendKeys("autopopup");
        NEW_POPUP_NAME_INPUT.sendKeys(Keys.ENTER);

        return this;

    }
    public NewMakePopupPage deleteAutoPopup() {
        CLICK_ON_POPUP.click();
        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
        return this;
    }

    public NewMakePopupPage deleteLauncher() {
        CLICK_ON_POPUP.click();
        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        System.out.println("вызов меню");
        LAUNCHER_POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить");
        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить В модалке");
        return this;

    }    public NewMakePopupPage conditionClickOnLauncher() {
        CONDITION.click();
        CONDITION_CLICKS.click();
        CONDITION_AFTER_CLICK.click();
        return this;
    }
//    }    public PopupMakePage conditionClickOnLauncher() {
//        Select select1 = new Select(CONDITION);
//        select1.selectByIndex(23);
//        return this;
//    }

}
