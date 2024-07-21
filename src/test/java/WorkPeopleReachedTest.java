import Client.ClientCheck;
import org.junit.Assert;
import org.junit.Test;

public class WorkPeopleReachedTest extends BaseTest{
    @Test
            public void StatCheck() {
        //получение пиплРич до  проверки клиента(via api)
        int oldStat = new ShowScenarioStatisticsSum().showStat();
        System.out.println("oldStat= " + oldStat);

        new ClientCheck().clientCheck();

        int increment = oldStat + 1;
        int newStat = new ShowScenarioStatisticsSum().showStat();
        Assert.assertEquals(increment, newStat);
    }}