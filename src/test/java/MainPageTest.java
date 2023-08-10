import Pages.MainPage;
import org.junit.Test;


public class MainPageTest extends BaseTest {
    /**
     * Тест создает и удаляет новый проект
     */

    public final static String BASE_URL = "https://login.sendpulse.com/pop-ups/main";


    @Test

    public void createProj() {

        new MainPage().openPage(BASE_URL).makeNewProject().makeProjectName()
                .clickGetCodeBtn().skipBtnClick().createPopupButtonCheck().pressCross()
                .deleteProject();

    }


//    @Test
//
//    public void statCheck() {
//        //получение пиплРич до  проверки клиента(via api)
//        int oldStat = new ShowScenarioStatisticsSum().showStat();
//        System.out.println("oldStat= " + oldStat);
//
//        new ClientCheck().clientCheck();
//
//        int increment = oldStat + 1;
//        int newStat = new ShowScenarioStatisticsSum().showStat();
//        Assert.assertEquals(increment, newStat);
//    }
}
