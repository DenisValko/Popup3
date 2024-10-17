import Pages.NewMakePopupPage;
import Pages.VideoPopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class VideoPopupTest extends BaseTest{

    @Test
    public void videoPopup(){

        for (int i=1; i<=4; i++) {
            System.out.println(i);
//            String currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
//            while (!currentURL.equals(STATIC_PROJECT)) {
//                currentURL = Selenide.webdriver().driver().getWebDriver().getCurrentUrl();

                open(STATIC_PROJECT);
                open(STATIC_PROJECT);
//            }
            new NewMakePopupPage().newMakePopup();
            new VideoPopupPage().videoPopupChoose(i);
            new NewMakePopupPage().designClickNext()
                    .makeName().targetClickNext().saveAndClose().deleteAutoPopup();
        }
    }
}



