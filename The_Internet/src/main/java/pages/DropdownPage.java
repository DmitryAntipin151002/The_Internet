package pages;

import com.codeborne.selenide.SelenideElement;
import config.Config;

import static com.codeborne.selenide.Selenide.*;

public class DropdownPage {
    private final String url = Config.getProperty("url.dropdown");
    private final SelenideElement dropdown = $("#dropdown");

    public DropdownPage openPage() {
        open(url);
        return this;
    }


    public DropdownPage selectOptionByValue(String value) {
        dropdown.selectOptionByValue(value);
        return this;
    }

    public DropdownPage selectOptionByText(String text) {
        dropdown.selectOption(text);
        return this;
    }

    public String getSelectedOptionText() {
        return dropdown.getSelectedOption().getText();
    }
}
