import Pages.HorizontalPopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class HorizontalPopupTest extends BaseTest{
    @Test
    public void horizontalPopup(){
        for (int i=1; i<=11;i++) {
            open(STATIC_PROJECT);
            System.out.println(i);
            new PopupMakePage().makeNewPopup();
            new HorizontalPopupPage().horizontalPopupChoose(i);
            new PopupMakePage().makeName().clickNext().clickSave().deletePopup();

        }
    }
}
