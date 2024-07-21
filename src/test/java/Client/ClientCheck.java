package Client;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;


import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;
import static org.example.constants.constants.CLIENT_URL;

public class ClientCheck {
    public void clientCheck() {
        executeJavaScript("window.open()");
        switchTo().window(1);
        open(CLIENT_URL);
        $(shadowCss(".sp-popup-image","sp-popups")).shouldBe(Condition.visible);
        System.out.println("Popup is ok");
//        $(shadowCss(".sp-poweredby-link","sp-popups")).shouldBe(Condition.visible);
//        System.out.println("Branding is OK");
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}


