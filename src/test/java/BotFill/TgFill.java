package BotFill;
import com.codeborne.selenide.Condition;

import static org.example.constants.constants.*;
public class TgFill {
    public TgFill() {
        TG_BOT_CHOOSE_DD.click();
        //choose bot
        TELEGRAM_BOT_PICK.click();
        TELEGRAM_CHAIN.shouldBe(Condition.visible);
    }
}
