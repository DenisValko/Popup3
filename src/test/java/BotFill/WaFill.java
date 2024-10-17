package BotFill;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
public class WaFill {
    public WaFill() {
        $x("//h1[contains(text(),' WhatsApp ')]").click();
        $("app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(2) > div > div").click();
        $x("//a[text()=\" Указать свою ссылку \"]").click();
        $(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(3) > app-input-text > div > input").click();
        $(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(3) > app-input-text > div > input").sendKeys("https://wa.me/dfgdfg");
        $(" app-builder > app-breadcrumb > ul > li:nth-child(2)").click();  // выход из настройки Wa
    }
}