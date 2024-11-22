package org.example;

import org.example.Pages.MainPage;
import org.junit.jupiter.api.Test;

import static org.example.constants.constants.BASE_URL;


public class CreateDelProjectTest extends BaseTest {
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
