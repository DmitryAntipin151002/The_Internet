package tests;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.checked;


public class CheckboxTest {

    @Test(description = "Тестирование чекбоксов")
    public void testCheckbox() {
        // Открываем страницу с чекбоксами
        open("https://the-internet.herokuapp.com/checkboxes");

        // Находим чекбоксы с использованием XPath через By.xpath
        SelenideElement checkbox1 = $(By.xpath("//*[@id='checkboxes']/input[1]"));
        SelenideElement checkbox2 = $(By.xpath("//*[@id='checkboxes']/input[2]"));
        WebElementCondition[] unchecked = new WebElementCondition[0];
        checkbox1.shouldBe(unchecked);

        // Проверяем состояние второго чекбокса (он должен быть выбранным)
        checkbox2.shouldBe(checked);

        // Если первый чекбокс не выбран, кликаем по нему, чтобы выбрать
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        // Если второй чекбокс выбран, кликаем по нему, чтобы снять выбор
        if (checkbox2.isSelected()) {
            checkbox2.click();
        }

        // Проверяем, что первый чекбокс теперь выбран
        checkbox1.shouldBe(checked);

        // Проверяем, что второй чекбокс теперь не выбран
        checkbox2.shouldBe(unchecked);
    }
}
