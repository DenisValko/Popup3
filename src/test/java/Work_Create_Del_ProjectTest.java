import Pages.MainPage;
import org.junit.Test;

import static org.example.constants.constants.BASE_URL;


public class Work_Create_Del_ProjectTest extends BaseTest {
    /**
     * Тест создает и удаляет новый проект
     */

    @Test
    public void createProj() {

        new MainPage()
                .openPage(BASE_URL)
                .makeNewProject()
                .makeProjectName()
                .clickGetCodeBtn()
                .skipBtnClick()
                .pressCross()
                .deleteProject();

    }
}
