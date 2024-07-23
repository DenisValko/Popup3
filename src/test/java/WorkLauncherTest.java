import Pages.LauncherPage;
import Pages.NewMakePopupPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class WorkLauncherTest extends BaseTest{

    @Test
    public void Launcher(){

        for (int i=1; i<=7; i++) {
            open(STATIC_PROJECT);
            new NewMakePopupPage().newMakePopup();
            new LauncherPage().LauncherPageChoose(i);
            new NewMakePopupPage().makeName().designClickNext().targetClickNext()
                    .saveAndClose().deleteLauncher();

        }
    }

}



