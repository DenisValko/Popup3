import Client.ClientCheck;
import Pages.HorizontalPopupPage;
import Pages.PopupMakePage;

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
            new PopupMakePage().makeName().clickNext().clickSave();

            //new ClientCheck().clientCheck();

            new PopupMakePage().deletePopup();

        }
    }
    // Лежит тут дичь всякая
//    @Test
//    public void d(){ open(STATIC_PROJECT);
//    new PopupMakePage().makeNewPopup();
//    SelenideElement wrapper = $("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(11) > app-root:nth-child(1) > app-layout:nth-child(2) > app-content:nth-child(1) > app-project:nth-child(2) > app-popups:nth-child(2) > app-new-popup:nth-child(2) > app-templates-step:nth-child(1) > div:nth-child(1)").waitUntil(Condition.visible,10000);
//        System.out.println(wrapper);
//    SelenideElement element = wrapper.find("(//a[@class='templates-nav-link'])[3]");
//    element.click();
//    }
}
