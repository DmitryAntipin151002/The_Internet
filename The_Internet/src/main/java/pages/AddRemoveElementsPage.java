package pages;

import com.codeborne.selenide.SelenideElement;
import config.Config;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddRemoveElementsPage {
    private final String url = Config.getProperty("url.addRemoveElements");


    private final SelenideElement addButton = $("button[onclick='addElement()']");
    private final SelenideElement deleteButton = $("button[onclick='deleteElement()']");

    public AddRemoveElementsPage openPage() {
        open(url);
        return this;
    }

    public AddRemoveElementsPage clickAddButton() {
        addButton.click();
        return this;
    }

    public AddRemoveElementsPage verifyDeleteButtonVisible() {
        deleteButton.shouldBe(visible);
        return this;
    }

    public AddRemoveElementsPage clickDeleteButton() {
        deleteButton.click();
        return this;
    }

    public AddRemoveElementsPage verifyDeleteButtonNotVisible() {
        deleteButton.shouldBe(not(visible));
        return this;
    }
}
