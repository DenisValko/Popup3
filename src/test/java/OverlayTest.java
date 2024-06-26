
import Pages.NewMakePopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class OverlayTest extends BaseTest {
    @Test
    public void overlay() {
        for (int i = 1; i <= 11; i++) {
            open(STATIC_PROJECT);
            System.out.println(i);
            NewMakePopupPage nmpPage = new NewMakePopupPage();

            nmpPage.newMakePopup().makeName().clickNext().clickNext()
                    .saveAndClose().deleteAutoPopup();

        }
    }
}

