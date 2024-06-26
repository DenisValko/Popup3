package Pages;

import BotFill.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.*;

public class FloatPopupPage {
    private final SelenideElement MENU_FLOAT = $x("(//span[contains(text(),'Плавающий')])[1]");
//    private final SelenideElement POPUP_FLOAT1 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-webinar-001-ru.png']");
    private final SelenideElement POPUP_FLOAT1 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(2) > img");
    private final SelenideElement POPUP_FLOAT2 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(3) > img");
    private final SelenideElement POPUP_FLOAT3 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(4) > img");
    private final SelenideElement POPUP_FLOAT4 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(5) > img");
    private final SelenideElement POPUP_FLOAT5 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(6) > img");
    private final SelenideElement POPUP_FLOAT6 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(7) > img");
    private final SelenideElement POPUP_FLOAT7 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(8) > img");
    private final SelenideElement POPUP_FLOAT8 = $("#content-wrapper > div.sp-templates > app-content > div > div:nth-child(9) > img");
    private final SelenideElement POPUP_FLOAT9 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/2-popup-ru.png']");
    private final SelenideElement POPUP_FLOAT10 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/Womens-Day-006-ru.png']");
    private final SelenideElement POPUP_FLOAT11 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/Womens-Day-003-ru.png']");
    private final SelenideElement POPUP_FLOAT12 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-0203-ru.png']");
    private final SelenideElement POPUP_FLOAT13 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-0200-ru.png']");
    private final SelenideElement POPUP_FLOAT14 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-0201-ru.png']");
    private final SelenideElement POPUP_FLOAT15 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-0202-ru.png']");
    private final SelenideElement POPUP_FLOAT16 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-0200-castomfield-ru.png']");
    private final SelenideElement POPUP_FLOAT17 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-0100-castomfield-ru.png']");
    private final SelenideElement POPUP_FLOAT18 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/christmas-004-ru.png']");
    private final SelenideElement POPUP_FLOAT19 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-cookie-001-ru.png']");
    private final SelenideElement POPUP_FLOAT20 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/Popup-001-ru.png']");
    private final SelenideElement POPUP_FLOAT21 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-img-001-ru.png']");
    private final SelenideElement POPUP_FLOAT22 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-img-002-ru.png']");
    private final SelenideElement POPUP_FLOAT23 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-img-003-ru.png']");
    private final SelenideElement POPUP_FLOAT24 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-img-mess-001-ru.png']");
    private final SelenideElement POPUP_FLOAT25 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/popup-img-mess-002-ru.png']");
    private final SelenideElement POPUP_FLOAT26 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/christmas-006-ru.png']");
    private final SelenideElement POPUP_FLOAT27 = $("img[src='https://d3ppax5trsa9bf.cloudfront.net/popup_templates/christmas-005-ru.png']");

    private final SelenideElement NPS = $(" app-nps-element > app-preview > div > div.panel-action-buttons > i.sp-icon.icon-ap-edit.color-light");
    private final SelenideElement CHOOSE_VAR = $(" app-builder > div > app-element-editor > app-nps-element > app-editor > div > div:nth-child(1) > app-attributes > div > div");
    private final SelenideElement FIRST_VAR = $(" li:nth-child(1) > a > span:nth-child(1) > span");



    public void floatPopupChoose(int i) {
        MENU_FLOAT.click();
        switch (i) {
            case 1:
                POPUP_FLOAT1.click();
                NPS.click();
                CHOOSE_VAR.click();
                FIRST_VAR.click();
                break;
            case 2:
                POPUP_FLOAT2.click();
                break;
            case 3:
                POPUP_FLOAT3.click();
                break;
            case 4:
                POPUP_FLOAT4.click();
                SelenideElement selenideElement = $("app-elements > app-custom-elements > div > app-messenger-element:nth-child(2) > app-preview > div > div.panel-action-buttons > i.sp-icon.icon-ap-edit.color-light");
                selenideElement.click();
                Selenide.$("app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div.form-group.ng-star-inserted > div > div").click();
                Selenide.$(" div.form-group.ng-star-inserted > div > ul > li:nth-child(3) > a").click();
                Selenide.$(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(3) > app-input-text > div > input").sendKeys("https:/wa.me/234234");
//                ELEMENTS.click();

//                $("#content-wrapper > app-root > app-constructor > app-layout > div > app-design > div > div.sp-constructor-main.ng-tns-c278-6 > app-popup-preview > div > app-desktop-preview > app-multiple > div").click();
                $x("//span[contains(text(),'Telegram')]").click();


                WATSAPP_BOT_CHOOSE_DD.click();
//                //customLink
//                FB_CUSTOM_LINK.shouldBe(Condition.visible).click();
//                WATSAPP_CUSTOM_LINK_INPUT.sendKeys("https://wa.me/12341234567");
//                //TelegaDD
//                TG_BOT_CHOOSE_DD.click();
//                //choose bot
//                TELEGRAM_BOT_PICK.click();
//                TELEGRAM_CHAIN.shouldBe(Condition.visible);
                break;
            case 5:
                POPUP_FLOAT5.click();
                new FbFill();
                new TgFill();
                new InstaFill();
                break;
            case 6:
                POPUP_FLOAT6.click();
                break;
            case 7:
                POPUP_FLOAT7.click();
                DELETE_MESSENGER.click();
                DELETE_MESSENGER.click();
                DELETE_MESSENGER.click();
                new CustomLinkFill();
                break;
            case 8:
                POPUP_FLOAT8.click();
                new FbFill();
                break;
            case 9:
                POPUP_FLOAT9.click();
                break;
            case 10:
                POPUP_FLOAT10.click();
                break;
            case 11:
                POPUP_FLOAT11.click();
                //удаление кнопок мессенджеров      ***** поправить*********
                DELETE_MESSENGER.click();
                DELETE_MESSENGER.click();
                DELETE_MESSENGER.click();
                new CustomLinkFill();
                break;
            case 12:
                POPUP_FLOAT12.click();
                break;
            case 13:
                POPUP_FLOAT13.click();
                break;
            case 14:
                POPUP_FLOAT14.click();
                break;
            case 15:
                POPUP_FLOAT15.click();
                break;
            case 16:
                POPUP_FLOAT16.click();
                break;
            case 17:
                POPUP_FLOAT17.click();
                break;
            case 18:
                POPUP_FLOAT18.click();
                break;
            case 19:
                POPUP_FLOAT19.click();
                break;
            case 20:
                POPUP_FLOAT20.click();
                break;
            case 21:
                POPUP_FLOAT21.click();
                break;
            case 22:
                POPUP_FLOAT22.click();
                break;
            case 23:
                POPUP_FLOAT23.click();
                break;
            case 24:
                POPUP_FLOAT24.click();
                new FbFill();
                break;
            case 25:
                POPUP_FLOAT25.click();
                new FbFill();
                break;
            case 26:
                POPUP_FLOAT26.click();
                break;
            case 27:
                POPUP_FLOAT27.click();
                break;
        }
    }

}

