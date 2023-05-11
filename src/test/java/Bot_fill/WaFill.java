package Bot_fill;

import static org.example.constants.constants.*;
public class WaFill {
    public WaFill() {
        WATSAPP_BOT_CHOOSE_DD.click();
        //choose bot
        WATSAPP_CUSTOM_LINK.click();
        WATSAPP_CUSTOM_LINK_INPUT.sendKeys("https://m.me/WA!!!!!");


    }
}