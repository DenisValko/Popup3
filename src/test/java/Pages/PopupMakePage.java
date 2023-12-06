package Pages;

import BotFill.FbFill;
import BotFill.TgFill;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.*;

public class PopupMakePage {
    private final SelenideElement MAKE_POPUP_BTN = $x("//a[contains(text(),'Добавить попап')]");
    //выбор типа попапа - оверлей
    private final SelenideElement MENU_OVERLAY = $("app-sidebar > div > ul > li:nth-child(4) > a > span");
    private final SelenideElement POPUP_OVERLAY1 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/owerlay-discount-004-ru.png']");
    private final SelenideElement POPUP_OVERLAY2 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/3-overlay-ru.png']");
    private final SelenideElement POPUP_OVERLAY3 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/bf-004-ru.png']");
    private final SelenideElement POPUP_OVERLAY4 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/Valentine%27sDay-002-ru.png']");
    private final SelenideElement POPUP_OVERLAY5 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/Womens-Day-002-ru.png']");
    private final SelenideElement POPUP_OVERLAY6 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/Womens-Day-005-ru.png']");
    private final SelenideElement POPUP_OVERLAY7 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/overlay-img-mess-001-ru.png']");
    private final SelenideElement POPUP_OVERLAY8 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/owerlay-0205-ru.png']");
    private final SelenideElement POPUP_OVERLAY9 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/overlay-img-003-ru.png']");
    private final SelenideElement POPUP_OVERLAY10 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/overlay-img-mess-002-ru.png']");
    private final SelenideElement POPUP_OVERLAY11 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/christmas-002-ru.png']");
    private final SelenideElement DELETE_POPUP_MENU_BTN = $("div.project-preview-heading> div > div.btn-group> div");
    private final SelenideElement LAUNCHER_POPUP_DEL_BTN = $x("(//a[contains(text(),'Удалить')])[1]");
    private final SelenideElement POPUP_DEL_BTN = $("#dropdown-animated > li:nth-child(2)");
    private final SelenideElement MODAL_DEL_BTN = $x("//button[contains(text(),'Удалить')]");
    private final SelenideElement CONDITION = $("select[class='form-control']");


    public PopupMakePage makeNewPopup() {
        MAKE_POPUP_BTN.click();
        return new PopupMakePage();
    }

    public PopupMakePage elements() {
        ELEMENTS.click();
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


    public PopupMakePage conditionClickOnLauncher() {
        CONDITION.selectOption("После клика на лаунчер");
        return this;
    }


    public PopupMakePage makeName() {
        EDITNAME_BTN.click();
        POPUP_NAME_INPUT.clear();
        POPUP_NAME_INPUT.sendKeys("autopopup");
        POPUP_NAME_INPUT.pressEnter();
        return this;
    }

    public PopupMakePage clickNext() {
        NEXT_BTN.click();
        System.out.println("click next");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public PopupMakePage saveAndClose () {
        SAVE_AND_CLOSE.click();
        if (NO_LEAD_WARNING.exists()){
        NO_LEAD_WARNING.click();
        }
        return this;
    }

    public PopupMakePage clickSaveAndPublish() {
        SAVE_AND_PUBLISH_BTN.click();
        System.out.println("новая кнопка");
        boolean isButtonDisplayed = SAVE_BTN_ALERT.isDisplayed();
        if (isButtonDisplayed) {
            System.out.println("старая кнопка");
            SAVE_BTN_ALERT.click();
        }
        return this;
    }

    public PopupMakePage clickSave() {
        SAVE_BTN.click();
        System.out.println("новая кнопка");
        boolean isButtonDisplayed = SAVE_BTN_ALERT.isDisplayed();
        if (isButtonDisplayed) {
            System.out.println("старая кнопка");
            SAVE_BTN_ALERT.click();
        }

        return this;
    }

    public PopupMakePage deleteAutoPopup() {
        CLICK_ON_POPUP.click();
        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        System.out.println("вызов меню");
        POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить");
        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить В модалке");
        return this;

    }
    public PopupMakePage deletePopup() {
        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        System.out.println("вызов меню");
        POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить");
        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить В модалке");
        return this;
    }

    public PopupMakePage deleteLauncher() {
//        CLICK_ON_POPUP.click();
        DELETE_POPUP_MENU_BTN.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        System.out.println("вызов меню");
        LAUNCHER_POPUP_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить");
        MODAL_DEL_BTN.shouldBe(Condition.enabled).click();
        System.out.println("клик на Удалить В модалке");
        return this;

    }
}
