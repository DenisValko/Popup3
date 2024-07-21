package BotFill;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TgFill {
    public TgFill() {
        $x("//h1[text()=\" Telegram \"]").click();
        $(" app-builder > div > app-element-editor > app-messenger-element > app-editor > div > div:nth-child(2) > div > div ").click();
        $x("//a[text()=\" AutoBot \"]").click();
        $(" app-builder > app-breadcrumb > ul > li:nth-child(2)").click();
    }
}
