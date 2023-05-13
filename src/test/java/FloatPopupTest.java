import Pages.FloatPopupPage;
import Pages.PopupMakePage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class FloatPopupTest extends BaseTest{

    @Test
    public void floatPopup(){


        for (int i=1; i<=27; i++) {
            System.out.println(i);
            open(STATIC_PROJECT);
            new PopupMakePage().makeNewPopup();
            new FloatPopupPage().floatPopupChoose(i);
            new PopupMakePage().makeName().clickNext().clickSave().deletePopup();
        }
    }

}
