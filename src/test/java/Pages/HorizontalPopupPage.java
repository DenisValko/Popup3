package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.FB_MESSENGER_CUSTOM_LINK_INPUT;
import static org.example.constants.constants.WATSAPP_CUSTOM_LINK_INPUT;

public class HorizontalPopupPage {
    private final SelenideElement MENU_HORIZONTAL = $(" app-sidebar > div > ul > li:nth-child(6) ");
    private final SelenideElement POPUP_HORIZ1 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/Valentine%27sDay-005-ru.png']");
    private final SelenideElement POPUP_HORIZ2 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/bf-001-ru.png']");
    private final SelenideElement POPUP_HORIZ3 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/Womens-Day-004-ru.png']");
    private final SelenideElement POPUP_HORIZ4 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/4-sticky-bar-ru.png']");
    private final SelenideElement POPUP_HORIZ5 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/stickybar-0200-castomfield-ru.png']");
    private final SelenideElement POPUP_HORIZ6 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/stickybar-mess-001-ru.png']");
    private final SelenideElement POPUP_HORIZ7 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/stickybar-img-cta-001-ru.png']");
    private final SelenideElement POPUP_HORIZ8 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/stickybar-0100-castomfield-ru.png']");
    private final SelenideElement POPUP_HORIZ9 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/christmas-001-ru.png']");
    private final SelenideElement POPUP_HORIZ10 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/stickybar-supportua-ru.png']");
    private final SelenideElement POPUP_HORIZ11 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/bar-cookies-001-ru.png']");

    public void horizontalPopupChoose(int i) {
        MENU_HORIZONTAL.click();
        switch (i) {
            case 1:
                POPUP_HORIZ1.click();
                break;
            case 2:
                POPUP_HORIZ2.click();
                break;
            case 3:
                POPUP_HORIZ3.click();
                break;
            case 4:
                POPUP_HORIZ4.click();
                break;
            case 5:
                POPUP_HORIZ5.click();
                break;
            case 6:
                POPUP_HORIZ5.click();
                break;
//            case 6:
//                POPUP_HORIZ6.click();
//                $x("(//div[@class='dropdown-custom-toggle'])[4]").click();
//                $x("(//a[contains(text(),'Указать свою ссылку')])[1]").click();
//                FB_MESSENGER_CUSTOM_LINK_INPUT.sendKeys("https://m.me/example!!!!!");
//                $x("(//div[@class='dropdown-custom-toggle'])[6]").click();
//                $x("(//a[contains(text(),'Указать свою ссылку')])[2]").click();
//                WATSAPP_CUSTOM_LINK_INPUT.sendKeys("https://m.me/WA!!!!!");
//
//                break;
            case 7:
                POPUP_HORIZ7.click();
                break;
            case 8:
                POPUP_HORIZ8.click();
                break;
            case 9:
                POPUP_HORIZ9.click();
                break;
            case 10:
                POPUP_HORIZ10.click();
                break;
            case 11:
                POPUP_HORIZ11.click();
                break;

        }
    }
}
