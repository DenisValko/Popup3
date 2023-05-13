package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.example.constants.constants.YOUTUBE_INPUT;
import static org.example.constants.constants.YOUTUBE_INPUT_LINK;

public class VideoPopupPage {
    private final SelenideElement MENU_VIDEO = $x("(//span[contains(text(),'С видео')])[1]");
    private final SelenideElement POPUP_VIDEO1 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/videopopup-0003-en.png']");
    private final SelenideElement POPUP_VIDEO2 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/videopopup-0004-ru.png']");
    private final SelenideElement POPUP_VIDEO3 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/videopopup-0001-en.png']");
    private final SelenideElement POPUP_VIDEO4 = $("img[src='https://pop-ups.sendpulse.com/popup_templates/videopopup-0002-ru.png']");


    public void videoPopupChoose(int i) {
        MENU_VIDEO.click();
        switch (i) {
            case 1:
                POPUP_VIDEO1.click();
                YOUTUBE_INPUT.sendKeys(YOUTUBE_INPUT_LINK);
                break;
            case 2:
                POPUP_VIDEO2.click();
                YOUTUBE_INPUT.shouldBe(Condition.visible).sendKeys(YOUTUBE_INPUT_LINK);
                break;
            case 3:
                POPUP_VIDEO3.click();
                YOUTUBE_INPUT.sendKeys(YOUTUBE_INPUT_LINK);
                break;
            case 4:
                POPUP_VIDEO4.click();
                YOUTUBE_INPUT.sendKeys(YOUTUBE_INPUT_LINK);
                break;
                    }
    }
}





