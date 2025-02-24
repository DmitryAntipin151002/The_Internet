package tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestAddElements {
@Test(description = "Тестирование добавления елемента на страницу")
    public void testAddElements() {
    open("https://the-internet.herokuapp.com/add_remove_elements/");
    SelenideElement addbutton = $("button[onclick='addElement()']");
    addbutton.click();
    SelenideElement deletebutton = $("button[onclick='deleteElement()']");
    deletebutton.shouldBe(visible);
    deletebutton.click();
    deletebutton.shouldNotBe(visible);
}

}
