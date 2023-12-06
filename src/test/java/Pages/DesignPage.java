package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DesignPage {
    private final SelenideElement ELEMENT = $(" app-builder > app-breadcrumb > ul > li.element-tab.active > a > img");
    public DesignPage DesignPageElement(){
        ELEMENT.click();
        return this;
    }
    public DesignPage DesignPageMessenger(){
        ELEMENT.click();
        return this;
    }
}
