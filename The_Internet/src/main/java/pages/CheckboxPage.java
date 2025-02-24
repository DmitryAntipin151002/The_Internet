package pages;

import com.codeborne.selenide.SelenideElement;
import config.Config;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckboxPage {
    private final String url = Config.getProperty("url.checkboxes");

    private final SelenideElement checkbox1 = $("input[type='checkbox']:nth-of-type(1)");
    private final SelenideElement checkbox2 = $("input[type='checkbox']:nth-of-type(2)");

    public CheckboxPage openPage() {
        open(url);
        return this;
    }

    public CheckboxPage verifyCheckbox1NotChecked() {
        checkbox1.shouldBe(not(checked));
        return this;
    }

    public CheckboxPage verifyCheckbox2Checked() {
        checkbox2.shouldBe(checked);
        return this;
    }

    public CheckboxPage toggleCheckbox1() {
        checkbox1.click();
        return this;
    }

    public CheckboxPage toggleCheckbox2() {
        checkbox2.click();
        return this;
    }

    public CheckboxPage verifyCheckbox1Checked() {
        checkbox1.shouldBe(checked);
        return this;
    }

    public CheckboxPage verifyCheckbox2NotChecked() {
        checkbox2.shouldBe(not(checked));
        return this;
    }
}
