package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static org.example.constants.constants.NAME_OF_NEW_PROJECT;


/**
 * Главная страница
 */
public class MainPage {
    private final SelenideElement newProjectButton = $(".btn.btn-create");
    private final SelenideElement newProjectNameField = $("input[placeholder='https://example.com']");
    private final SelenideElement getCodeBtn = $("button[class='btn btn-create ng-star-inserted']");
    private final SelenideElement skipBtn = $("button[class='btn btn-link']");
    private final SelenideElement createPopupBtn = $("a[type='button']");
    private final SelenideElement crossBtn = $(".visually-hidden");
    private final SelenideElement projectMenu = $x("//*[@id=\"button-animated\"]");
//    private final SelenideElement projectMenu = $x("(//span[@class='glyphicon glyphicon-option-horizontal color-light'])[1]");
    private final SelenideElement nameOfProjectKill = $x("//a[contains(text(),'Удалить')]");
    private final SelenideElement pressDel = $x("//button[contains(text(),'Удалить')]");


    public MainPage openPage(String url) {
        open(url);
        return new MainPage();
    }
    public MainPage makeNewProject(){
        newProjectButton.click();
        return new MainPage();
    }
    public MainPage makeProjectName() {
        newProjectNameField.sendKeys(NAME_OF_NEW_PROJECT);
        return new MainPage();
    }
    public MainPage clickGetCodeBtn() {
        getCodeBtn.click();
        return new MainPage();
    }
    public MainPage skipBtnClick() {
        skipBtn.click();
        return new MainPage();
    }


    /**
     *
     * @return Проверка на наличие кнопки Создать попап
     */
    public MainPage createPopupButtonCheck() {
        Selenide.element(createPopupBtn).should(Condition.appear);
        return new MainPage();

    }
    public MainPage pressCross() {
        Selenide.element(crossBtn).click();
        return new MainPage();
    }
    public void deleteProject() {
        Selenide.element(projectMenu).click();
        Selenide.element(nameOfProjectKill).click();
        Selenide.element(pressDel).click();
        new MainPage();
    }

}