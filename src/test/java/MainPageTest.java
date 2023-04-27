import org.junit.Test;

public class MainPageTest extends BaseTest {

    public final static String BASE_URL = "https://login.sendpulse.com/pop-ups/main";

    @Test
    public void createProj() {
        // MainPage mainPage = new MainPage();
        new MainPage().openPage(BASE_URL).makeNewProject().makeProjectName()
                .clickGetCodeBtn().skipBtnClick().createPopupButtonCheck().pressCross()
                .deleteProject();

        //перенести в попап тесты
       // new MainPage().enterProject();
    }
}