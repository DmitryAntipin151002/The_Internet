package pages;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import config.Config;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDropPage {
    private final String url = Config.getProperty("url.dragAndDrop");

    // Находим элементы для перетаскивания
    private final SelenideElement aBox = $("#column-a");
    private final SelenideElement bBox = $("#column-b");

    public DragAndDropPage openPage() {
        open(url);
        return this;
    }

    public DragAndDropPage dragAtoB() {
      actions().dragAndDrop(aBox, bBox).perform();
        return this;
    }

    public DragAndDropPage dragBtoA() {
        actions().dragAndDrop(bBox, aBox).perform();
        return this;
    }

    public String getBoxAText() {
        return aBox.getText();
    }

    public String getBoxBText() {
        return bBox.getText();
    }
}
