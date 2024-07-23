import Pages.FloatPopupPage;
import Pages.LauncherPage;
import Pages.NewMakePopupPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;
import static org.example.constants.constants.CLIENT_URL;
import static org.example.constants.constants.STATIC_PROJECT;

public class LauncherCheckTest  extends BaseTest{
    @Test
    public void LauncherCheck() throws InterruptedException {
        open(STATIC_PROJECT);
        //создание попапа
        NewMakePopupPage page = new NewMakePopupPage();
        page.newMakePopup();
        new FloatPopupPage().floatPopupChoose(2);
        page.makeName().designClickNext().targetClickNext().saveAndClose();

        //создание лаунчера
        page.newMakePopup();
        LauncherPage lPage = new LauncherPage();
        lPage.LauncherPageChoose(3).LauncherOptions();
        page.makeName().designClickNext().targetClickNext().saveAndClose();

        SelenideElement autopopup = $x("//label[normalize-space()='autopopup']");
//        autopopup.click();
        SelenideElement autolaunch = $x("(//label[normalize-space()='autopopup'])[2]");
        autolaunch.click();
        $(" div > div.btn-group.btn-edit").click();

        Thread.sleep(4000);
        $x("//span[contains(text(),' Условия показа ')]").click();

        Thread.sleep(4000);

        page.conditionClickOnLauncher();
        page.saveAndClose();
        //проверка
        executeJavaScript("window.open()");
        switchTo().window(1);
        open(CLIENT_URL);
        $(shadowCss(".sp-launcher","sp-popups")).click();
        Selenide.closeWindow();
        switchTo().window(0);

        //удаление
        autopopup.click();
        page.deleteLauncher();
//        Thread.sleep(4000);
        autopopup.click();
        page.deleteAutoPopup();
    }
}
