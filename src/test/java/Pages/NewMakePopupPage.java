package Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.Keys;

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

    public NewMakePopupPage newMakePopup() {
        MAKE_POPUP_BTN.click();
        return this;
    }
    public NewMakePopupPage newMakePopupFromBalnk() {
        MAKE_POPUP_BTN.click();
        MAKE_FROM_BLANK_BTN.click();
        return this;
    }

//    Logger logger = LoggerFactory.getLogger(NewMakePopupPage.class);

    public NewMakePopupPage clickNext() {
        NEXT_BTN.shouldBe(Condition.exist).shouldBe(visible).click();
//        logger.info(()->"***click Next***");

        return this;

    }

    public NewMakePopupPage saveAndClose () {
            SAVE_AND_CLOSE.shouldBe(exist);
            SAVE_AND_CLOSE.click();
//        logger.info(()->"***Save&click***");
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
//        logger.info(()->"вызов меню");
        POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
//        logger.info(()->"клик на Удалить");
        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
//        logger.info(()->"клик на Удалить В модалке");
        return this;

    }
//    public PopupMakePage deletePopup() {
//        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
//        System.out.println("вызов меню");
//        POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
//        System.out.println("клик на Удалить");
//        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
//        System.out.println("клик на Удалить В модалке");
//        return this;
//    }
//
//    public PopupMakePage deleteLauncher() {
////        CLICK_ON_POPUP.click();
//        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
//        System.out.println("вызов меню");
//        LAUNCHER_POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
//        System.out.println("клик на Удалить");
//        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
//        System.out.println("клик на Удалить В модалке");
//        return this;
//
//    }


}
