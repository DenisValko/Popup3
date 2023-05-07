import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class PopupMakeTest extends BaseTest{
    @Test
    public void newPopup(){
        for (int i=1; i<7; i++) {
            open(STATIC_PROJECT);
            /**
             * choosePopup задает номер оверлейного попапа, значения 1-11
             */
            new PopupMakePage().makeNewPopup().choosePopup(i).chooseImgPosition().makeName().clickNext().clickSave().deletePopup();
        }
    }
}
