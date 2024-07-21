import Pages.LauncherPage;
import Pages.NewMakePopupPage;
import Pages.OverlayMakePage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.example.constants.constants.STATIC_PROJECT;

public class LauncherTest  extends BaseTest{

    @Test
    public void Launcher(){

        for (int i=1; i<=7; i++) {
            System.out.println(i);
            open(STATIC_PROJECT);
            new NewMakePopupPage().newMakePopup();
            new LauncherPage().LauncherPageChoose(i);
            new OverlayMakePage().makeName().clickNext().clickNext().saveAndClose().deleteLauncher();
        }
    }

}



