package org.example.constants;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class constants {

    // popup_make_del
    public static final String STATIC_PROJECT = "https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/";
//    public static final String STATIC_PROJECT = "https://pre.sendpulse.com/pop-ups/project/ceb77478-19c6-4d70-b1a2-c3b28a9abd72/";
//    public static final String STATIC_PROJECT = "https://popup-front-1.sendpulse.test/pop-ups/project/f7d0bf5f-e6b5-407e-bb0a-35a5f0246af6/popups";
    public static final String NAME_OF_NEW_PROJECT = "https://auto.html";
    public static final String BASE_URL = "https://login.sendpulse.com/pop-ups/";
//    public static final String BASE_URL = "https://popup-front-1.sendpulse.test/pop-ups";

//    public static final String ENVIRONMENT ="https://pre.sendpulse.com/login/";  //прпепрод
    public static final String ENVIRONMENT = "https://login.sendpulse.com/login/";   //прод
//    public static final String ENVIRONMENT = "https://popup-front-1.sendpulse.test/login";   //front1

    public static final String PASS = "123456";
    public static final String LOGIN = "d.valko+prod_auto2@sendpulse.com";
    public static final String CLIENT_URL = "https://denisvalko.github.io/d.valko+prod_auto.html";
//    public static final String CLIENT_URL = "https://denisvalko.github.io/d.valko+prod_auto_front1.html";

    //locators

    public static final SelenideElement TELEGRAM_BOT_PICK = $("(//a[normalize-space()='AutoBot'])[1]");
    //Цепочка бота
    public static final SelenideElement TELEGRAM_CHAIN = $x("(//a[contains(text(),'Приветственная серия')])[1]");

    // удаление мессенджера
    public static final SelenideElement DELETE_MESSENGER = $x("(//span[@class='sp-icon icon-trash'])[1]");

    //ДД для бота
    public static final SelenideElement TG_BOT_CHOOSE_DD = $x("(//div[@class='dropdown-custom-toggle'])[6]");
    public static final SelenideElement FB_BOT_CHOOSE_DD = $x("(//div[@class='dropdown-custom-toggle'])[4]");
    public static final SelenideElement INSTA_BOT_CHOOSE_DD = $x("(//div[@class='dropdown-custom-toggle'])[8]");
    public static final SelenideElement WATSAPP_BOT_CHOOSE_DD = $x("(//div[@class='dropdown-custom-toggle'])[4]");
    public static final SelenideElement CUSTOM_LINK_DD = $("div[class='dropdown-custom form-control'] span[class='caret']");

    //выбор мессанджера и установка кастом ссылки
    public static final SelenideElement FB_CUSTOM_LINK = $x("(//a[contains(text(),'Указать свою ссылку')])[1]");
    public static final SelenideElement INSTA_CUSTOM_LINK = $x("(//a[@class='dropdown-item'][contains(text(),'Указать свою ссылку')])[3]");
    public static final SelenideElement WATSAPP_CUSTOM_LINK = $x("(//a[@class='dropdown-item'][contains(text(),'Указать свою ссылку')])[3]");
    public static final SelenideElement CUSTOM_LINK_CUSTOM_LINK = $x("//a[contains(text(),'Пользовательская ссылка')]");

    public static final SelenideElement FB_MESSENGER_CUSTOM_LINK_INPUT = $("input[placeholder='https://m.me/example']");
    public static final SelenideElement WATSAPP_CUSTOM_LINK_INPUT = $("input[placeholder='https://wa.me/12341234567']");
    public static final SelenideElement INSTA_CUSTOM_LINK_INPUT = $x("(//input[@placeholder='https://instagram.com/direct/t/'])[1]");
    public static final SelenideElement CUSTOM_LINK_CUSTOM_LINK_INPUT = $x("(//input[@placeholder='https://example.com'])[1]");


    //выбор положения картинки
    public static final SelenideElement IMAGE_POSITION1 = $("img[src='assets/images/ic-left-pic.svg']");
    public static final SelenideElement IMAGE_POSITION2 = $("img[src='assets/images/ic-right-pic.svg']");
    public static final SelenideElement IMAGE_POSITION3 = $("img[src='assets/images/ic-top-pic.svg']");
    public static final SelenideElement IMAGE_POSITION4 = $("img[src='assets/images/ic-bg-pic.svg']");


    //расположение попапа
//    public static final SelenideElement LOCATION = $x("//select[@formcontrolname='position']");

    //кнопка некст при редактировании попапа
    public static final SelenideElement NEXT_BTN = $("app-btn-controls > div > button");

    //сохранить попап
    public static final SelenideElement SAVE_AND_PUBLISH_BTN = $x("//button[contains(text(),'Сохранить и опубликовать')]");
    public static final SelenideElement SAVE_BTN = $("app-targeting > div > div > div > button");
    public static final SelenideElement SAVE_BTN_ALERT = $("body > modal-container > div.modal-dialog > div > app-confirm > div.modal-footer > button.btn.btn-success.ng-star-inserted");

    // лаунчер
    public static final SelenideElement LAUNCHER_POPUP_DEL_BTN = $x("//a[contains(text(),\"Удалить\")]");


    public static final SelenideElement SAVE_AND_CLOSE = $("#content-wrapper > app-root > app-constructor > app-layout > div > nav > app-header > div > div > div.sp-navbar-header-right > app-btn-controls > div");
//    public static final SelenideElement TARGET_NEXT = $("app-btn-controls > div > button");

    //переимменовать попап
    public static final SelenideElement EDITNAME_BTN = $(" span > i");
    public static final SelenideElement EDITNAME_INPUT_BTN = $("app-popup-name > div");
    public static final SelenideElement CLICK_ON_POPUP = $x("//label[normalize-space()='autopopup']");
    public static final SelenideElement POPUP_NAME_INPUT = $(" app-input-text > div > input");


    public static final SelenideElement NO_LEAD_WARNING = $("app-confirm > div.modal-footer > button.btn.btn-success.ng-star-inserted");
    public static final SelenideElement ELEMENTS = $(" app-builder > app-breadcrumb > ul > li.element-tab > a > img");


    //инпут ссылки ютуба
    public static final SelenideElement YOUTUBE_INPUT = $x("(//input[@placeholder='Добавьте ссылку на YouTube '])[1]");
    public static final String YOUTUBE_INPUT_LINK = "https://www.youtube.com/watch?v=Ae829mFAGGE&ab_channel=RHINO";

    // Клиентская сторона

    public static final String BODY_SHOW_USER_PLAN = "{\"query\":\"\\n    query showUserPlans($first: Int, $filter: ShowUserPlansFilterInterface, $locale: String!) {\\n  showUserPlans(first: $first, filter: $filter, locale: $locale) {\\n    edges {\\n      status\\n      planId\\n      userOptions {\\n        code\\n        amount\\n      }\\n    }\\n    result(locale: $locale) {\\n      code\\n      errors {\\n        message\\n        field\\n      }\\n    }\\n  }\\n}\\n    \",\"variables\":{\"filter\":{\"widget\":\"ceb77478-19c6-4d70-b1a2-c3b28a9abd72\"},\"locale\":\"ru\",\"first\":1}}";


    public static final SelenideElement SAVE_TO_ADDRESS_BOOK = $(" app-save-address-book");
    public static final SelenideElement OPEN_ON_CLICK_AT_LAUNCHER = $("app-open-by-launcher > div");
//Условия
    public static final SelenideElement CONDITIONS = $("#content-wrapper > app-root > app-constructor > app-layout > div > app-targeting > div > div.panel-constructor-steps.panel-conditions.ng-tns-c323-9.ng-trigger.ng-trigger-fadeIn.ng-star-inserted > app-conditions > div > div.sp-table-targeting.ng-star-inserted > div > app-default-condition > div > div > app-scenarios > div > select");






}
