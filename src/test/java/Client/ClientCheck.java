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
        $(shadowCss(".sp-popup-image.svelte-1h1sv9n","sp-popups")).shouldBe(Condition.visible);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);

        //System.out.println(driver.getTitle());


    }
}


