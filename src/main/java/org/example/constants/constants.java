package org.example.constants;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class constants {
    // popup_make_del
    public static final String STATIC_PROJECT = "https://login.sendpulse.com/pop-ups/project/ceb77478-19c6-4d70-b1a2-c3b28a9abd72/";
//    public static final String STATIC_PROJECT = "https://pre.sendpulse.com/pop-ups/project/ceb77478-19c6-4d70-b1a2-c3b28a9abd72/";
    public static final String NAME_OF_NEW_PROJECT = "https://auto.html";
//    public static final String ENVIRONMENT ="https://pre.sendpulse.com/login/";  //прпепрод
    public static final String ENVIRONMENT = "https://login.sendpulse.com/login/";   //прод
    public static final String PASS = "123456";
    public static final String LOGIN = "d.valko+prod_auto@sendpulse.com";
    public static final String CLIENT_URL = "https://denisvalko.github.io/d.valko+prod_auto.html";

    //locators

    public static final SelenideElement TELEGRAM_BOT_PICK = $x("(//a[normalize-space()='AutoBot'])[1]");
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
    public static final SelenideElement LOCATION = $x("//select[@formcontrolname='position']");

    //кнопка некст при редактировании попапа
    public static final SelenideElement NEXT_BTN = $x("//button[contains(text(),'Далее')]");

    //сохранить попап
    public static final SelenideElement SAVE_AND_PUBLISH_BTN = $x("//button[contains(text(),'Сохранить и опубликовать')]");
    public static final SelenideElement SAVE_BTN = $("app-targeting > div > div > div > button");
    public static final SelenideElement SAVE_BTN_ALERT = $("body > modal-container > div.modal-dialog > div > app-confirm > div.modal-footer > button.btn.btn-success.ng-star-inserted");

    //сохранить и закрыть лаунчер без связки с попапом
    public static final SelenideElement SAVE_AND_CLOSE = $x("(//button[contains(text(),'Сохранить и закрыть')])[1]");

    //переимменовать попап
    public static final SelenideElement EDITNAME_BTN = $x("//span[@class='sp-icon icon-ap-edit color-light']");
    public static final SelenideElement EDITNAME_INPUT_BTN = $x("//app-input-text[@formcontrolname='name']//input[@type='text']");
    public static final SelenideElement CLICK_ON_POPUP = $x("//label[normalize-space()='autopopup']");
    public static final SelenideElement OLD_NAME_POPUP = $x("//app-input-text[@formcontrolname='name']//input[@type='text']");

    //инпут ссылки ютуба
    public static final SelenideElement YOUTUBE_INPUT = $x("(//input[@placeholder='Добавьте ссылку на YouTube '])[1]");
    public static final String YOUTUBE_INPUT_LINK = "https://www.youtube.com/watch?v=Ae829mFAGGE&ab_channel=RHINO";

    // Клиентская сторона
    public static final String BASE_URL = "https://login.sendpulse.com/";
    public static final String BODY_SHOW_USER_PLAN = "{\"query\":\"\\n    query showUserPlans($first: Int, $filter: ShowUserPlansFilterInterface, $locale: String!) {\\n  showUserPlans(first: $first, filter: $filter, locale: $locale) {\\n    edges {\\n      status\\n      planId\\n      userOptions {\\n        code\\n        amount\\n      }\\n    }\\n    result(locale: $locale) {\\n      code\\n      errors {\\n        message\\n        field\\n      }\\n    }\\n  }\\n}\\n    \",\"variables\":{\"filter\":{\"widget\":\"ceb77478-19c6-4d70-b1a2-c3b28a9abd72\"},\"locale\":\"ru\",\"first\":1}}";
}
