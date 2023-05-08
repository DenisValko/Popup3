import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

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

    // удаление мессенджера
    private final SelenideElement DELETE_MESSENGER = $x("(//span[@class='sp-icon icon-trash'])[1]");

    //выбор телеги в ДД
    private final SelenideElement BOT_CHOOSE_DD = $("div[class='form-control dropdown-custom dropdown-select'] div[class='dropdown-custom-toggle']");
    private final SelenideElement TELEGRAM_BOT_PICK = $x("(//a[normalize-space()='AutoBot'])[1]");
    //private final SelenideElement TELEGRAM_BOT_PICK = $("li[class='ng-star-inserted'] a[class='dropdown-item']");

    //Цепочка бота
    private final SelenideElement TELEGRAM_CHAIN = $x("(//a[contains(text(),'Приветственная серия')])[1]");


    //выбор мессанджера и установка кастом ссылки
    private final SelenideElement MESSENGER_CUSTOM_LINK = $x("(//a[contains(text(),'Указать свою ссылку')])[1]");
    private final SelenideElement MESSENGER_CUSTOM_LINK_INPUT = $("input[placeholder='https://m.me/example']");


    //выбор положения картинки
    private final SelenideElement IMAGE_POSITION1 = $("img[src='assets/images/ic-left-pic.svg']");
    private final SelenideElement IMAGE_POSITION2 = $x("//app-image-settings//div[2]//label[1]");


    private final SelenideElement MENU_BTN = $x("//button[@id='button-animated']");
    private final SelenideElement DEL_BTN = $x("//a[contains(text(),'Удалить')]");
    private final SelenideElement MODAL_DEL_BTN = $x("//button[contains(text(),'Удалить')]");

    private final SelenideElement NEXT_BTN = $x("//button[contains(text(),'Далее')]");
    private final SelenideElement SAVE_BTN = $x("//button[contains(text(),'Сохранить и опубликовать')]");
    private final SelenideElement EDITNAME_BTN = $x("//span[@class='sp-icon icon-ap-edit color-light']");
    private final SelenideElement EDITNAME_INPUT_BTN = $x("//app-input-text[@formcontrolname='name']//input[@type='text']");
    private final SelenideElement CLICK_ON_POPUP = $x("//label[normalize-space()='autopopup']");
    private final SelenideElement OLD_NAME_POPUP = $x("//app-input-text[@formcontrolname='name']//input[@type='text']");


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
                DELETE_MESSENGER.click();
                BOT_CHOOSE_DD.click();
                TELEGRAM_BOT_PICK.click();
                TELEGRAM_CHAIN.shouldBe(Condition.visible);

                break;
            case 9:
                POPUP_OVERLAY9.click();
                break;
            case 10:
                POPUP_OVERLAY10.click();
                BOT_CHOOSE_DD.click();
                MESSENGER_CUSTOM_LINK.click();
                MESSENGER_CUSTOM_LINK_INPUT.sendKeys("https://m.me/example!!!!!");

                break;
            case 11:
                POPUP_OVERLAY11.click();
                DELETE_MESSENGER.click();
                BOT_CHOOSE_DD.click();
                TELEGRAM_BOT_PICK.click();
                TELEGRAM_CHAIN.shouldBe(Condition.visible);
                break;

        }
        return new PopupMakePage();
    }
//
//    public PopupMakePage choosePopup() {
//
//        return new PopupMakePage();
//    }

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
        MENU_BTN.click();
        DEL_BTN.click();
        MODAL_DEL_BTN.click();
        return new PopupMakePage();
    }
}
