package Pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NewMakePopupElementsPage {
    private final SelenideElement POPUP_ELEMENT = $("ul > li.element-tab > a");
    private final SelenideElement POPUP_ELEMENT_DELETE2 = $("app-preview > div > div.panel-action-buttons > i.sp-icon.icon-trash.color-light:nth-child(2)");
    private final SelenideElement POPUP_OPEN_ANIMATION = $(" app-opening-animation > div > select");
    private final SelenideElement POPUP_CLOSE_ANIMATION = $("app-closing-animation > div > select");

    public NewMakePopupElementsPage elementClick(){
        POPUP_ELEMENT.click();
        return this;
    }
    public NewMakePopupElementsPage elementDelete(){
        POPUP_ELEMENT_DELETE2.click();
        return this;
    }
    public NewMakePopupElementsPage openAnimation(){
        POPUP_OPEN_ANIMATION.click();
        return this;
    }
    public NewMakePopupElementsPage closeAnimation(){
        POPUP_CLOSE_ANIMATION.click();
        return this;
    }

}
