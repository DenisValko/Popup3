import Pages.ConditionsPage;
import Pages.NewMakePopupPage;
import Pages.PopupMakePage;
import org.junit.Test;
import java.util.Random;
import static com.codeborne.selenide.Selenide.*;
import static org.example.constants.constants.STATIC_PROJECT;

public class OverlayTest extends BaseTest{
    @Test
    public void overlay() throws InterruptedException {
        for (int i=1; i<=11; i++) {
            open(STATIC_PROJECT);
            System.out.println(i);
            Random random = new Random();
            int j =random.nextInt(4)+1;
            PopupMakePage popupMakePage = new PopupMakePage();
            popupMakePage.makeNewPopup().choosePopup(i);
            NewMakePopupPage nmpPage = new NewMakePopupPage();

            nmpPage.makeName().clickNext();

            new ConditionsPage().conditions(3).clickNext();
//            nmpPage.clickNext();
            nmpPage.saveAndClose();
            popupMakePage.deleteAutoPopup();

        }
    }
}
