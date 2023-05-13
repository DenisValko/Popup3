package Pages;

import BotFill.FbFill;
import BotFill.TgFill;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.*;

public class PopupMakePage {
    private final SelenideElement MAKE_POPUP_BTN = $x("//a[contains(text(),'Добавить попап')]");

    //выбор типа попапа - оверлей
    private final SelenideElement MENU_OVERLAY = $x("(//a[@class='templates-nav-link'])[2]");

    private final SelenideElement POPUP_OVERLAY1 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/owerlay-discount-004-ru.png']");
    private final SelenideElement POPUP_OVERLAY2 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/3-overlay-ru.png']");
    private final SelenideElement POPUP_OVERLAY3 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/bf-004-ru.png']");
    private final SelenideElement POPUP_OVERLAY4 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/Valentine%27sDay-002-ru.png']");
    private final SelenideElement POPUP_OVERLAY5 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/Womens-Day-002-ru.png']");
    private final SelenideElement POPUP_OVERLAY6 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/Womens-Day-005-ru.png']");
    private final SelenideElement POPUP_OVERLAY7 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/overlay-img-mess-001-ru.png']");
    private final SelenideElement POPUP_OVERLAY8 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/owerlay-0205-ru.png']");
    private final SelenideElement POPUP_OVERLAY9 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/overlay-img-003-ru.png']");
    private final SelenideElement POPUP_OVERLAY10 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/overlay-img-mess-002-ru.png']");
    private final SelenideElement POPUP_OVERLAY11 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/christmas-002-ru.png']");

    private final SelenideElement DELETE_POPUP_MENU_BTN = $x("//button[@id='button-animated']");
    private final SelenideElement POPUP_DEL_BTN = $x("//a[contains(text(),'Удалить')]");
    private final SelenideElement MODAL_DEL_BTN = $x("//button[contains(text(),'Удалить')]");



    public PopupMakePage makeNewPopup() {
        MAKE_POPUP_BTN.click();
        return new PopupMakePage();
    }

    public PopupMakePage choosePopup(int i) {
        MENU_OVERLAY.click();
        switch (i) {
            case 1:
                POPUP_OVERLAY1.click();
                break;
            case 2:
                POPUP_OVERLAY2.click();
                break;
            case 3:
                POPUP_OVERLAY3.click();
                break;
            case 4:
                POPUP_OVERLAY4.click();
                break;
            case 5:
                POPUP_OVERLAY5.click();
                break;
            case 6:
                POPUP_OVERLAY6.click();
                break;
            case 7:
                POPUP_OVERLAY7.click();
                break;
            case 8:
                POPUP_OVERLAY8.click();
                new FbFill();
                new TgFill();
                break;
            case 9:
                POPUP_OVERLAY9.click();
                break;
            case 10:
                POPUP_OVERLAY10.click();
                new FbFill();
                break;
            case 11:
                POPUP_OVERLAY11.click();
                new FbFill();
                new TgFill();
                break;
        }
        return new PopupMakePage();
    }


    public PopupMakePage chooseImgPosition() {
        IMAGE_POSITION1.click();
        return new PopupMakePage();
    }

    public PopupMakePage makeName() {
        EDITNAME_BTN.click();
        OLD_NAME_POPUP.clear();

        EDITNAME_INPUT_BTN.sendKeys("autopopup");
        EDITNAME_INPUT_BTN.pressEnter();
        return new PopupMakePage();
    }

    public PopupMakePage clickNext() {
        NEXT_BTN.click();
        return new PopupMakePage();
    }

    public PopupMakePage clickSave() {
        SAVE_BTN.click();
        return new PopupMakePage();
    }

    public PopupMakePage deletePopup() {
        CLICK_ON_POPUP.click();
        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).click();
        POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
        MODAL_DEL_BTN.click();
        return new PopupMakePage();
    }
}
