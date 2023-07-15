import Pages.PopupMakePage;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static org.example.constants.constants.STATIC_PROJECT;

public class OverlayTest extends BaseTest{
    @Test
    public void overlay(){
        for (int i=1; i<=11; i++) {
            open(STATIC_PROJECT);



            /**
             * choosePopup задает номер оверлейного попапа, значения 1-11
             */
            System.out.println(i);
            Random random = new Random();
            int j =random.nextInt(4)+1;
            new PopupMakePage().makeNewPopup().choosePopup(i).chooseImgPosition(j).makeName().clickNext().clickSave().deletePopup();

        }
    }
}
