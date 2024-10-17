import Pages.FloatPopupPage;
import Pages.NewMakePopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class FloatPopupTest extends BaseTest {

    @Test
    public void floatPopup() throws InterruptedException {

        for (int i = 9; i <= 9; i++) {
            System.out.println(i);
//            Random random = new Random();
//            int j = random.nextInt(4) + 1;
            open(STATIC_PROJECT);
            open(STATIC_PROJECT);

            NewMakePopupPage nmp = new NewMakePopupPage();
            nmp.newMakePopup();
            new FloatPopupPage().floatPopupChoose(i);
            nmp.designClickNext().makeName().targetClickNext().saveAndClose().deleteAutoPopup();
        }
    }
}
