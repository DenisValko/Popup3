
import Pages.NewMakePopupPage;
import Pages.OverlayMakePage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class WorkOverlayTest extends BaseTest {
    @Test
    public void overlay() {
        for (int i = 1; i <= 11; i++) {
            open(STATIC_PROJECT);
            open(STATIC_PROJECT);
            System.out.println(i);
            new NewMakePopupPage().newMakePopup();
            new OverlayMakePage().overlayPopupChoose(i);
            new NewMakePopupPage().makeName().designClickNext()
                    .targetClickNext().saveAndClose().deleteAutoPopup();

        }
    }
}

