import Pages.HorizontalPopupPage;
import Pages.NewMakePopupElementsPage;
import Pages.NewMakePopupPage;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class HorizontalPopupTest extends BaseTest{
    @Test
    public void horizontalPopup() throws InterruptedException {
        for (int i=1; i<=11;i++) {
            open(STATIC_PROJECT);
            System.out.println(i);
            NewMakePopupPage nmp = new NewMakePopupPage();
            nmp.newMakePopup();
            new HorizontalPopupPage().horizontalPopupChoose(i);
            nmp.clickNext().makeName();
            Thread.sleep(500);
            nmp.clickNext();
            Thread.sleep(500);


               nmp.saveAndClose().deleteAutoPopup();
        }
    }
}
