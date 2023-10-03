package Pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.*;

public class LauncherPage {
    private final SelenideElement MENU_Launcher = $x("(//span[contains(text(),'Лаунчер')])[1]");

    private final SelenideElement POPUP_LAUNCHER1 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-bubble.png']");
    private final SelenideElement POPUP_LAUNCHER2 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-bubble.png']");
    private final SelenideElement POPUP_LAUNCHER3 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-fire.png']");
    private final SelenideElement POPUP_LAUNCHER4 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-course-ru.png']");
    private final SelenideElement POPUP_LAUNCHER5 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-callme-ru.png']");
    private final SelenideElement POPUP_LAUNCHER6 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-discount-ru.png']");
    private final SelenideElement POPUP_LAUNCHER7 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/launcher-support.png']");

    private final SelenideElement LAUNCHER_OPTIONS = $("#content-wrapper > app-root > app-layout > app-content > app-project > app-popups > app-new-popup > app-content-step > div > app-content > div > div.popups-content-settings > div > div.panel-body > app-launcher-settings > app-launcher-actions > div > div > div > select");


    public void saveAndClose () {
        SAVE_AND_CLOSE.click();
    }
    public LauncherPage LauncherPageChoose (int i) {
        MENU_Launcher.click();
        switch (i) {
            case 1:
                POPUP_LAUNCHER1.shouldBe(Condition.visible);
                POPUP_LAUNCHER1.click();
                break;
            case 2:
                POPUP_LAUNCHER2.click();
                break;
            case 3:
                POPUP_LAUNCHER3.click();
                break;
            case 4:
                POPUP_LAUNCHER4.click();

                break;
            case 5:
                POPUP_LAUNCHER5.click();

                break;
            case 6:
                POPUP_LAUNCHER6.click();
                break;
            case 7:
                POPUP_LAUNCHER7.click();

                break;
        }
        return this;
    }
    public LauncherPage LauncherOptions(){


            Select select = new Select(LAUNCHER_OPTIONS);
            select.selectByIndex(1);
            return this;

    }

}




