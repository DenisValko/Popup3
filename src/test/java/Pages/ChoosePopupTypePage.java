package Pages;

import com.codeborne.selenide.SelenideElement;
//import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class ChoosePopupTypePage {
    private final SelenideElement POPUP_TYPE_DD = $(" app-popup-type > div > div");
    private final SelenideElement POPUP_TYPE_FLOAT = $("app-sidebar > div > ul > li:nth-child(5)");
    private final SelenideElement POPUP_TYPE_MODAL = $("app-sidebar > div > ul > li:nth-child(8) > a");
    private final SelenideElement POPUP_TYPE_OVERLAY = $("app-sidebar > div > ul > li:nth-child(4) > a");
    private final SelenideElement POPUP_TYPE_STICKY = $("app-sidebar > div > ul > li:nth-child(6) > a");
    private final SelenideElement POPUP_TYPE_VIDEO = $("app-sidebar > div > ul > li:nth-child(7) > a");
    private final SelenideElement POPUP_TYPE_LAUNCHER = $("app-sidebar > div > ul > li:nth-child(9) > a");
    private final SelenideElement POPUP_TYPE_NPS = $(" app-sidebar > div > ul > li:nth-child(10) > a");
    private final SelenideElement POPUP_TYPE_COLOR = $(" app-theme > select");
    private final SelenideElement POPUP_TYPE_LOCATION = $("div.form-group.form-style > app-position > select");
    private final SelenideElement ELEMENT_BUTTON = $("app-breadcrumb > ul > li.body-tab > a");
//    private final SelenideElement ELEMENT_BUTTON = $("#content-wrapper > app-root > app-constructor > app-layout > div > app-design > div > div.sp-constructor-settings.ng-tns-c276-6 > app-builder > app-breadcrumb > ul > li.body-tab");

    public ChoosePopupTypePage choosePopupType(String type){
//      POPUP_TYPE_DD.click();
//        ELEMENT_BUTTON.click();
        switch (type) {
          case "float":
              POPUP_TYPE_FLOAT.click();
              break;
          case "modal":
              POPUP_TYPE_MODAL.click();
              break;
          case "overlay":
              POPUP_TYPE_OVERLAY.click();
              break;
          case "sticky":
              POPUP_TYPE_STICKY.click();
              break;
          case "video":
              POPUP_TYPE_VIDEO.click();
              break;
          case "launcher":
              POPUP_TYPE_LAUNCHER.click();
              break;
      }
        return this;
    }
    public ChoosePopupTypePage choosePopupColor(int color){
        Select select = new Select(POPUP_TYPE_COLOR);
        select.selectByIndex(color);
        return this;

    }public ChoosePopupTypePage choosePopupLocation(int loc){
        Select select = new Select(POPUP_TYPE_LOCATION);
        select.selectByIndex(loc);
        return this;
    }
}


