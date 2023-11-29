import Pages.PopupMakePage;
import Pages.VideoPopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class VideoPopupTest  extends BaseTest{

    @Test
    public void videoPopup(){

        for (int i=1; i<=4; i++) {
            System.out.println(i);
            open(STATIC_PROJECT);
            new PopupMakePage().makeNewPopup();
            new VideoPopupPage().videoPopupChoose(i);
            new PopupMakePage().makeName().clickNext().clickSaveAndPublish().deleteAutoPopup();
        }
    }

}



