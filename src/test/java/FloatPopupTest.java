import Pages.FloatPopupPage;
import Pages.PopupMakePage;
import org.junit.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class FloatPopupTest extends BaseTest {

    @Test
    public void floatPopup() {

        for (int i = 1; i <= 27; i++) {
            System.out.println(i);
            Random random = new Random();
            int j = random.nextInt(4) + 1;

            open(STATIC_PROJECT);
            new PopupMakePage().makeNewPopup();
            new FloatPopupPage().floatPopupChoose(i);
            new PopupMakePage().makeName().location().chooseImgPosition(j)
                    .clickNext()
                    .clickSave().deletePopup();

        }
    }
}
