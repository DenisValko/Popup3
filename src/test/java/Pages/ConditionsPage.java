package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.support.ui.Select;
import static org.example.constants.constants.*;

public class ConditionsPage {

    public ConditionsPage conditions(int i) throws InterruptedException {

    if(!CONDITIONS.isEnabled()) {
    Thread.sleep(200);
    }
        CONDITIONS.click();
        Thread.sleep(200);
        Select select = new Select(CONDITIONS);
        System.out.println(select);
        select.selectByIndex(i);

        return this;
    }

    public ConditionsPage clickNext() {
        NEXT_BTN.shouldBe(Condition.exist).click();
        System.out.println("click");
        return this;

    }
    }

