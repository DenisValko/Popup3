import Pages.FloatPopupPage;
import Pages.NewMakePopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class FloatPopupTest_not_compleet extends BaseTest {

    @Test
    public void floatPopup() throws InterruptedException {

        for (int i = 1; i <= 27; i++) {
            System.out.println(i);
//            Random random = new Random();
//            int j = random.nextInt(4) + 1;
            open(STATIC_PROJECT);

            NewMakePopupPage nmp = new NewMakePopupPage();
            nmp.newMakePopup();
            new FloatPopupPage().floatPopupChoose(i);
            nmp.clickNext().makeName();
            Thread.sleep(500);
            nmp.clickNext();
            Thread.sleep(500);


            nmp.saveAndClose().deleteAutoPopup();


        }
    }
}
