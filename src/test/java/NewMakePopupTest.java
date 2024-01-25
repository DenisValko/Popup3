import Pages.MainPage;
import Pages.ChoosePopupTypePage;
import Pages.NewMakePopupElementsPage;
import Pages.NewMakePopupPage;
import org.junit.Test;
import static org.example.constants.constants.*;

public class NewMakePopupTest extends BaseTest{
    @Test
    public void Create_Rename_Del(){
        new MainPage().openPage(STATIC_PROJECT);
        NewMakePopupPage nmpPage = new NewMakePopupPage();
        nmpPage.newMakePopupPage();
        String type="float";
//        "float" "modal""overlay""sticky" "video" "launcher":
//          у флоат и стики есть choosePopupLocation

        new ChoosePopupTypePage().choosePopupType(type).choosePopupColor(1).choosePopupLocation(1);
        // белый=0 темный=1 цветной=2
        // внизу_слеваа=0 низ_право=1....
        new NewMakePopupElementsPage().elementClick();
//        тут написать выбор условий

        nmpPage.clickNext().makeName().clickNext();
//        тут сохранение в адрес книгу и ЦРМ

        nmpPage.saveAndClose().deleteAutoPopup();


    }
}
