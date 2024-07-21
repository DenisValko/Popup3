//import Pages.FloatPopupPage;
//import Pages.LauncherPage;
//import Pages.PopupMakePage;
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.SelenideElement;
//import org.junit.Test;
//
//import static com.codeborne.selenide.Selectors.shadowCss;
//import static com.codeborne.selenide.Selenide.*;
//import static org.example.constants.constants.CLIENT_URL;
//import static org.example.constants.constants.STATIC_PROJECT;
//
//public class LauncherCheckTest  extends BaseTest{
//    @Test
//    public void LauncherCheck() throws InterruptedException {
//        open(STATIC_PROJECT);
//
//        //создание попапа
//        PopupMakePage page = new PopupMakePage();
//        page.makeNewPopup();
//        new FloatPopupPage().floatPopupChoose(2);
//        page.makeName().clickNext();
//        page.clickSaveAndPublish();
//
//        //создание лаунчера
//        page.makeNewPopup();
//        LauncherPage lPage = new LauncherPage();
//        lPage.LauncherPageChoose(3).LauncherOptions();
//        page.clickNext().clickSaveAndPublish();
//
//        SelenideElement autopopup = $x("//label[normalize-space()='autopopup']");
//        autopopup.click();
//        $(" div > div.btn-group.btn-edit").click();
//        Thread.sleep(4000);
//        $x("//*[@id=\"content-wrapper\"]/app-root/app-layout/app-content/app-project/app-popups/app-edit-popup/app-content-step/div/ul/li[2]/a").click();
//
//        page.conditionClickOnLauncher();
//
//        page.clickSave();
//
//
//        //проверка
//        executeJavaScript("window.open()");
//        switchTo().window(1);
//        open(CLIENT_URL);
//        $(shadowCss(".sp-launcher","sp-popups")).click();
//        Selenide.closeWindow();
//        switchTo().window(0);
//
//        //удаление
////        autopopup.click();
//        page.deletePopup();
//        Thread.sleep(4000);
//        page.deleteLauncher();
//    }
//}
