import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class PopupMakeTest extends BaseTest{
    @Test
    public void newPopup(){


        open(STATIC_PROJECT);
        new PopupMakePage().makeNewPopup().ChoosePopup().ChooseImgPosition();
    }
}
