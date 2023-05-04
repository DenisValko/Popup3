import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PopupMakePage {
    private final SelenideElement MAKE_POPUP_BTN = $x("//a[contains(text(),'Добавить попап')]");
    private final SelenideElement POPUP_WITH_EMAIL = $("img[src='https://pop-ups.sendpulse.com/popup_templates/popup-0200-ru.png']");
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


    public PopupMakePage makeNewPopup(){
        MAKE_POPUP_BTN.click();
        return new PopupMakePage();
    }
    public PopupMakePage choosePopup(){
        POPUP_WITH_EMAIL.click();
        return new PopupMakePage();
    }
    public PopupMakePage chooseImgPosition() {
        IMAGE_POSITION1.click();
        return new PopupMakePage();
    }
    public PopupMakePage makeName(){
        EDITNAME_BTN.click();
            $(new By.ByXPath("//app-input-text[@formcontrolname='name']//input[@type='text']"))
               .clear();

        EDITNAME_INPUT_BTN.sendKeys("autopopup");
        EDITNAME_INPUT_BTN.pressEnter();
        return new PopupMakePage();
    }
    public PopupMakePage clickNext(){
        NEXT_BTN.click();
        return new PopupMakePage();
    }
    public PopupMakePage clickSave(){
        SAVE_BTN.click();
        return new PopupMakePage();
    }
    public PopupMakePage deletePopup(){
        CLICK_ON_POPUP.click();
        MENU_BTN.click();
        DEL_BTN.click();
        MODAL_DEL_BTN.click();
        return new PopupMakePage();
    }

}
