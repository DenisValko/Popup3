package Bot_fill;

import static org.example.constants.constants.*;
public class InstaFill {
    public InstaFill() {
        INSTA_BOT_CHOOSE_DD.click();
        //choose bot
        INSTA_CUSTOM_LINK.click();
        INSTA_CUSTOM_LINK_INPUT.sendKeys("https://m.me/INSTA!!!!!");

    }
}