package pages;

import com.codeborne.selenide.SelenideElement;
import config.Config;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ContextMenuPage {
    private final String url = Config.getProperty("url.contextMenu");
    private final SelenideElement contextBox = $x("//div[@id='hot-spot']");

    public ContextMenuPage openPage() {
        open(url);
        return this;
    }

    public ContextMenuPage rightClickOnContextBox() {
        contextBox.should(exist).shouldBe(visible);
        contextBox.contextClick();
        return this;
    }

    public String getAlertText() {
        return switchTo().alert().getText();
    }

    public ContextMenuPage acceptAlert() {
        switchTo().alert().accept();
        return this;
    }
}
