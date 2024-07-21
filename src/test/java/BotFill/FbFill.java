package BotFill;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FbFill {
    public FbFill() {
        $x("//h1[contains(text(),' Messenger ')]").click();
        $(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(2) > div > div").click();
        $x("//*[text()=\" Указать свою ссылку \"]").click();
        $(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(3) > app-input-text > div > input").click();
        $(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(3) > app-input-text > div > input").sendKeys("https://m.me/dfgdfg");
        $(" app-builder > app-breadcrumb > ul > li:nth-child(2)").click();  // выход из настройки ФБ
    }
}
