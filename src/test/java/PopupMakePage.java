import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PopupMakePage {
    private final SelenideElement MAKE_POPUP_BTN = $x("//button[contains(text(),'Создать попап')]");
    private final SelenideElement POPUP_WITH_EMAIL = $x("//div[@class='templates']//div[2]//img[1]");
    private final SelenideElement IMAGE_POSITION1 = $x("//img[@src='assets/images/ic-left-pic.svg']");
    private final SelenideElement IMAGE_POSITION2 = $x("//app-image-settings//div[2]//label[1]");



    public PopupMakePage makeNewPopup(){
        MAKE_POPUP_BTN.click();
        return new PopupMakePage();
    }
    public PopupMakePage ChoosePopup(){
        POPUP_WITH_EMAIL.click();
        return new PopupMakePage();
    }
    public PopupMakePage ChooseImgPosition(){
        IMAGE_POSITION1.click();
        return new PopupMakePage();
    }

}
