package Client;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;


import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;
import static org.example.constants.constants.CLIENT_URL;

public class ClientCheck {
    public void clientCheck() {
        executeJavaScript("window.open()");
        switchTo().window(1);
        open(CLIENT_URL);
        $(shadowCss(".sp-popup-image.svelte-1h1sv9n","sp-popups")).shouldBe(Condition.visible);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);

        //System.out.println(driver.getTitle());


    }
}



//
//                if (driver.getTitle().equals("ERROR_TITLE 400")){
//                System.out.println("********************************** Mail pigeons wont fly :( **************************************");
//                driver.quit();
//                }
//                driver.switchTo().window((String) tabs41.get(0));
//                // вставить проверку на 400 ошибку
//
//                //assert driver.findElement(By.linkText("ERROR_HOME"))
//
//                ArrayList tabs2 = new ArrayList(driver.getWindowHandles());