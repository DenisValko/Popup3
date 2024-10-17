import Pages.HorizontalPopupPage;
import Pages.NewMakePopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class HorizontalPopupTest extends BaseTest{
    @Test
        public void HorizontalPopup(){
        for (int i=1; i<=11;i++) {
            open(STATIC_PROJECT);
            open(STATIC_PROJECT);
            new NewMakePopupPage().newMakePopup();
            new HorizontalPopupPage().horizontalPopupChoose(i);
            new NewMakePopupPage().designClickNext().makeName()
                    .targetClickNext().saveAndClose().deleteAutoPopup();
        }
    }
}
