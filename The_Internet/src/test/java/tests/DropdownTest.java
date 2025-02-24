package tests;

import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;

public class DropdownTest {
    private final DropdownPage page = new DropdownPage();

    @Test(description = "Тестирование выпадающего списка")
    public void testDropdown() {
        page.openPage()
                .selectOptionByValue("1");  // Выбираем опцию по значению
        assertEquals(page.getSelectedOptionText(), "Option 1", "Выбран неправильный элемент!");

        page.selectOptionByValue("2");  // Выбираем другую опцию по значению
        assertEquals(page.getSelectedOptionText(), "Option 2", "Выбран неправильный элемент!");

        page.selectOptionByText("Option 1");  // Выбираем опцию по тексту
        assertEquals(page.getSelectedOptionText(), "Option 1", "Выбран неправильный элемент!");
    }
}
